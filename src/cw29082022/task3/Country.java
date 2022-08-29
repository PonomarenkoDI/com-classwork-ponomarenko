package cw29082022.task3;

import cw29082022.task2.City;

import java.util.Scanner;

public class Country {
    private String nameCountry;
    private String nameContinent;
    private long quantityOfPeopleInCountry;
    private int phoneCodeOfCountry;
    private String nameCapitalOfCountry;
    private String namesCitiesOfCountry;

    private City [] city1;



    public Country(String nameCountry, String nameContinent, long quantityOfPeopleInCountry) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
        this.quantityOfPeopleInCountry = quantityOfPeopleInCountry;
    }

    public Country(String nameCountry,
                   String nameContinent,
                   long quantityOfPeopleInCountry,
                   String nameCapitalOfCountry,
                   String namesCitiesOfCountry) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
        this.quantityOfPeopleInCountry = quantityOfPeopleInCountry;
        this.nameCapitalOfCountry = nameCapitalOfCountry;
        this.namesCitiesOfCountry = namesCitiesOfCountry;
    }

    public Country(String nameCountry,
                   String nameContinent,
                   long quantityOfPeopleInCountry,
                   String nameCapitalOfCountry,
                   String namesCitiesOfCountry,
                   int phoneCodeOfCountry,
                   City [] city1) {
        this.nameCountry = nameCountry;
        this.nameContinent = nameContinent;
        this.quantityOfPeopleInCountry = quantityOfPeopleInCountry;
        this.nameCapitalOfCountry = nameCapitalOfCountry;
        this.namesCitiesOfCountry = namesCitiesOfCountry;
        this.phoneCodeOfCountry = phoneCodeOfCountry;
        this.city1 = city1;
    }
}

