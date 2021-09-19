package com.example.project1.models;

public class Room {
    private int id;
    private String name;
    private String countryName;
    private boolean isOnn;

    public Room(){}

    public Room(int id, String name, String countryName, boolean isOnn) {
        this.id = id;
        this.name = name;
        this.countryName = countryName;
        this.isOnn = isOnn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getisOnn() {
        return isOnn;
    }

    public void setisOnn(boolean isOnn) {
        this.isOnn = isOnn;
    }
}
