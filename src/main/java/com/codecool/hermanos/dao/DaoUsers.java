package com.codecool.hermanos.dao;

import com.codecool.hermanos.model.Users;

import java.util.List;

public interface DaoUsers {
    List getAllUsers();
    void addNewUser(Users user);
    Users findUserByID(long id);
}
