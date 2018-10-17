package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoAddress;
import com.codecool.hermanos.dao.DaoUsers;
import com.codecool.hermanos.dao.implementation.DaoAddressJPA;
import com.codecool.hermanos.dao.implementation.DaoUsersJPA;
import com.codecool.hermanos.model.Address;
import com.codecool.hermanos.model.Users;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

@WebServlet(urlPatterns = {"/registration"})
public class RegistrationController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Parse request
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        Map<String, String> credentials = gson.fromJson(request.getReader(), type);

        // Should be refactored
        DaoUsers du = DaoUsersJPA.getInstance();
        DaoAddress da = DaoAddressJPA.getInstance();

        // Create address
        String country = credentials.get("country");
        String zipcode = credentials.get("zipcode");
        String city = credentials.get("city");
        String addr = credentials.get("addr");

        Address address = new Address(country, zipcode, city, addr);
        da.addNewAddress(address);
        System.out.println("New address added. " + city + " " + addr);

        // Create user
        String name = credentials.get("name");
        String email = credentials.get("email");
        String password = credentials.get("password");
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        Users newUser = new Users(name, email, hashedPassword, address);
        du.addNewUser(newUser);
        System.out.println("New user added. Name: " + name + " E-mail: " + email);
    }

}
