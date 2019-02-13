package com.capgemini.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Schip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;


    public String type;
    public int lengte;
    public int aantalPassagiers;
    public LocalDateTime bouwdatum;
    public String naam;
    public int topSnelheid;



}
