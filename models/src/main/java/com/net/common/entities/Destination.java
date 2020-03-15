package com.net.common.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String point;
    @OneToOne
    private Scenario scenario;
    @ManyToOne
    private Customer customer;

}
