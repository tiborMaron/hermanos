package com.codecool.hermanos.api;

import com.codecool.hermanos.repository.DaoUsers;
import com.codecool.hermanos.model.Users;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

@RestController
@CrossOrigin
public class LoginControllerREST {

    private DaoUsers daoUsers;

    public LoginControllerREST(DaoUsers daoUsers) {
        this.daoUsers = daoUsers;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request) throws IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(120 * 60);

        // Parse credentials
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>() {
        }.getType();
        Map<String, String> credentials = gson.fromJson(request.getReader(), type);

        String email = credentials.get("email");
        String password = credentials.get("password");

        // Get user from DB
        String resultMessage;
        Users user = daoUsers.findUserByEmail(email);
        if (user == null) {
            resultMessage = "E-mail address not found!";
            System.out.println(resultMessage);
            return resultMessage;
        }

        // Verify user
        if (BCrypt.checkpw(password, user.getPassword())) {
            session.setAttribute("user", user);
            resultMessage = "Successful login: " + email;
        } else {
            resultMessage = "Invalid password!";
        }

        System.out.println(resultMessage);
        return resultMessage;
    }
}