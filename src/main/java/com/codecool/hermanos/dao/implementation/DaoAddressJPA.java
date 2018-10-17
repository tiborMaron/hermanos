package com.codecool.hermanos.dao.implementation;

import com.codecool.hermanos.controller.JPAController;
import com.codecool.hermanos.dao.DaoAddress;
import com.codecool.hermanos.model.Address;

public class DaoAddressJPA implements DaoAddress {

    @Override
    public void addNewAddress(Address address) {
        JPAController.use(jpaController -> jpaController.addNewAddress(address));
    }
}
