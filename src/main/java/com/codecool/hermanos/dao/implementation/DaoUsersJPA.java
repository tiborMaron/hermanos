package com.codecool.hermanos.dao.implementation;

import com.codecool.hermanos.controller.JPAController;
import com.codecool.hermanos.dao.DaoUsers;
import com.codecool.hermanos.model.Users;

import java.util.List;

public class DaoUsersJPA implements DaoUsers {

    private static DaoUsers du;
    private DaoUsersJPA() {}

    public static DaoUsers getInstance() {
        if (du == null) du = new DaoUsersJPA();
        return du;
    }

    @Override
    public List getAllUsers() {
        return JPAController.use(JPAController::getAllUser);
    }

    @Override
    public void addNewUser(Users user) {
        JPAController.use(jpaController -> jpaController.addNewUser(user));
    }

    @Override
    public Users findUserByID(long id) {
        return JPAController.use(jpaController -> jpaController.getUserByID(id));
    }
}