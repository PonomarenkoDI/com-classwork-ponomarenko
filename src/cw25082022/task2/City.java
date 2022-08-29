package cw25082022.task2;

import java.util.Scanner;

public class City {
    private String nameCity;
    private String nameRegion;
    private String nameCountry;
    private int quantityOfPeopleInCity;
    private int postIndexOfCity;
    private int phoneCodeOfCity;

    private Scanner sc = new Scanner(System.in);

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity() {
        System.out.println("Введите название города: ");
        this.nameCity = sc.nextLine();
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion() {
        System.out.println("Введите название региона: ");
        this.nameRegion = sc.nextLine();
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry() {
        System.out.println("Введите название страны: ");
        this.nameCountry = sc.nextLine();
    }

    public int getQuantityOfPeopleInCity() {
        return quantityOfPeopleInCity;
    }

    public void setQuantityOfPeopleInCity() {
        System.out.println("Введите число жителей в городе: ");
        this.quantityOfPeopleInCity = sc.nextInt();
    }

    public int getPostIndexOfCity() {
        return postIndexOfCity;
    }

    public void setPostIndexOfCity() {
        System.out.println("Введите почтовый индекс города: ");
        this.postIndexOfCity = sc.nextInt();
    }

    public int getPhoneCodeOfCity() {
        return phoneCodeOfCity;
    }

    public void setPhoneCodeOfCity() {
        System.out.println("Введите телефонный код города: ");
        this.phoneCodeOfCity = sc.nextInt();
    }
}

