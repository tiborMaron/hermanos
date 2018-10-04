package com.codecool.hermanos.model;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String country;
    private String zipcode;
    private String city;
    private String addr;

    @OneToOne(mappedBy = "address")
    private Users user;

    public Address() {
    }

    public Address(String country, String zipcode, String city, String addr) {
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.addr = addr;
    }

    public Address(String country, String zipcode, String city, String address, Users user) {
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.addr = address;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getAddr() {
        return addr;
    }

    public Users getUser() {
        return user;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
