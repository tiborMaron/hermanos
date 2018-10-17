package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoUsers;
import com.codecool.hermanos.dao.implementation.DaoUsersJPA;
import com.codecool.hermanos.model.Address;
import com.codecool.hermanos.model.Users;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/registration"})
public class RegistrationController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoUsers du = DaoUsersJPA.getInstance();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String country = request.getParameter("country");
        String zipcode = request.getParameter("zipcode");
        String city = request.getParameter("city");
        String addr = request.getParameter("addr");

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        Address address = new Address(country, zipcode, city, addr);

        Users newUser = new Users(name, email, hashedPassword, address);
        du.addNewUser(newUser);
    }
}
