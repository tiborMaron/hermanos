package com.codecool.hermanos.api;

import com.codecool.hermanos.repository.DaoAddress;
import com.codecool.hermanos.repository.DaoUsers;
import com.codecool.hermanos.model.Address;
import com.codecool.hermanos.model.Users;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

@RestController
@CrossOrigin
public class RegistrationControllerREST {

    private DaoUsers daoUsers;
    private DaoAddress daoAddress;

    public RegistrationControllerREST(DaoUsers daoUsers, DaoAddress daoAddress) {
        this.daoUsers = daoUsers;
        this.daoAddress = daoAddress;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public void register(HttpServletRequest request) throws IOException {

        // Parse request
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>() {
        }.getType();
        Map<String, String> credentials = gson.fromJson(request.getReader(), type);

        // Create address
        String country = credentials.get("country");
        String zipcode = credentials.get("zipcode");
        String city = credentials.get("city");
        String addr = credentials.get("addr");

        Address address = new Address(country, zipcode, city, addr);
        daoAddress.save(address);
        System.out.println("New address added. " + city + " " + addr);

        // Create user
        String name = credentials.get("name");
        String email = credentials.get("email");
        String password = credentials.get("password");
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        daoUsers.save(new Users(name, email, hashedPassword, address));
        System.out.println("New user added. Name: " + name + " E-mail: " + email);
    }
}