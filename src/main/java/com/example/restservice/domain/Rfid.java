package com.example.restservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Rfid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String zemlja;
    private String ime;
    private String datum;
    private double lat;
    private double lon;
}
