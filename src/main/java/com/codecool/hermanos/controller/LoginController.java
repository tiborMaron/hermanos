package com.codecool.hermanos.controller;

import com.codecool.hermanos.dao.DaoUsers;
import com.codecool.hermanos.model.Users;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class LoginController extends HttpServlet {

    private DaoUsers daoUsers;

    public LoginController(DaoUsers daoUsers) {
        this.daoUsers = daoUsers;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        httpSession.setMaxInactiveInterval(120 * 60);

        // Parse credentials
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>() {
        }.getType();
        Map<String, String> credentials = gson.fromJson(request.getReader(), type);

        // Verify user
        String email = credentials.get("email");
        String hashedPassword = BCrypt.hashpw(credentials.get("password"), BCrypt.gensalt());

        Users user = daoUsers.findUserByEmail(email);
        String resultMessage;
        if (user != null) {
            if (BCrypt.checkpw(user.getPassword(), hashedPassword)) {
                httpSession.setAttribute("userID", user.getId());
                resultMessage = "Successful login!";
            } else {
                resultMessage = ("Invalid password!");
            }
        } else {
            resultMessage = ("E-mail address not found!");
        }

        System.out.println(resultMessage);
        response.getWriter().write(gson.toJson(resultMessage));
    }

}
