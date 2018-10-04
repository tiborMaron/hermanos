package com.codecool.hermanos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Product product;

    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @Temporal(TemporalType.DATE)
    private Date datePaid;

    @Temporal(TemporalType.DATE)
    private Date dateDelivered;
}
