package cw25082022.task3;

import java.util.Scanner;

public class Country {
    private String nameCountry;
    private String nameContinent;
    private long quantityOfPeopleInCountry;
    private int phoneCodeOfCountry;
    private String nameCapitalOfCountry;
    private String namesCitiesOfCountry;

    Scanner sc = new Scanner(System.in);

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry() {
        System.out.println("Введите название страны: ");
        this.nameCountry = sc.nextLine();
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent() {
        System.out.println("Введите название континента: ");
        this.nameContinent = sc.nextLine();
    }

    public long getQuantityOfPeopleInCountry() {
        return quantityOfPeopleInCountry;
    }

    public void setQuantityOfPeopleInCountry() {
        System.out.println("Введите количество жителей в стране: ");
        this.quantityOfPeopleInCountry = sc.nextLong();
    }

    public int getPhoneCodeOfCountry() {
        return phoneCodeOfCountry;
    }

    public void setPhoneCodeOfCountry() {
        System.out.println("Введите телефонный код страны: ");
        this.phoneCodeOfCountry = sc.nextInt();
    }

    public String getNameCapitalOfCountry() {
        return nameCapitalOfCountry;
    }

    public void setNameCapitalOfCountry() {
        System.out.println("Введите название столицы страны: ");
        this.nameCapitalOfCountry = sc.nextLine();
    }

    public String getNamesCitiesOfCountry() {
        return namesCitiesOfCountry;
    }

    public void setNamesCitiesOfCountry() {
        System.out.println("Введите названия городов страны: ");
        this.namesCitiesOfCountry = sc.nextLine();
    }
}
