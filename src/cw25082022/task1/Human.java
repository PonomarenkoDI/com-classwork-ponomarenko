package cw25082022.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    private String nameSurnamePatronymic;
    private LocalDate dateBorn;
    private long numberPhone;
    private String city;
    private String country;
    private String addressHome;

    private Scanner sc = new Scanner(System.in);

    public String getNameSurnamePatronymic() {
        return nameSurnamePatronymic;
    }

    public void setNameSurnamePatronymic() {
        System.out.println("Введите ФИО: ");
        this.nameSurnamePatronymic = sc.nextLine();
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn() {
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Введите дату рождения: ");
        this.dateBorn = LocalDate.of(year,month,year);
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone() {
        System.out.println("Введите номер телефона: ");
        this.numberPhone = sc.nextLong();
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        System.out.println("Введите город: ");
        this.city = sc.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.println("Введите страну: ");
        this.country = sc.nextLine();
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome() {
        System.out.println("Введите домашний адрес: ");
        this.addressHome = sc.nextLine();
    }

}


