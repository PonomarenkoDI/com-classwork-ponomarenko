package cw29082022.task2;

import cw29082022.task1.Human;

import java.time.Year;
import java.util.Scanner;

public class City {
    private String nameCity;
    private String nameRegion;
    private String nameCountry;
    private int quantityOfPeopleInCity;
    private int postIndexOfCity;
    private int phoneCodeOfCity;

    private Human [] population;

    public City(String nameCity, String nameRegion, String nameCountry) {
        this.nameCity = nameCity;
        this.nameRegion = nameRegion;
        this.nameCountry = nameCountry;
    }

    public City(String nameCity, String nameRegion, String nameCountry, int quantityOfPeopleInCity, int postIndexOfCity) {
        this.nameCity = nameCity;
        this.nameRegion = nameRegion;
        this.nameCountry = nameCountry;
        this.quantityOfPeopleInCity = quantityOfPeopleInCity;
        this.postIndexOfCity = postIndexOfCity;
    }

    public City(String nameCity,
                String nameRegion,
                String nameCountry,
                int quantityOfPeopleInCity,
                int postIndexOfCity,
                int phoneCodeOfCity,
                Human [] population) {
        this.nameCity = nameCity;
        this.nameRegion = nameRegion;
        this.nameCountry = nameCountry;
        this.quantityOfPeopleInCity = quantityOfPeopleInCity;
        this.postIndexOfCity = postIndexOfCity;
        this.phoneCodeOfCity = phoneCodeOfCity;
        this.population = population;
    }

}

