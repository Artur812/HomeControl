package com.example.project1.dao;

public class CountryResponse {
    private String name;
    private String countryName;

    public CountryResponse() {
    }

    public CountryResponse(String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CountryResponse{" +
                "name='" + name + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
