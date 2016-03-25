package com.costrella.cemetery.model;

import java.io.Serializable;

/**
 * Created by mike on 2016-03-24.
 */
public class Person implements Serializable{
    private String name;
    private String surname;
    private String death;
    private Sector sector;

    public Person(String name, String surname, String death, Sector sector) {
        this.name = name;
        this.surname = surname;
        this.death = death;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getDeathDateAndLocation(){
        return death + "kwatera:" + sector.getName();
    }
}

