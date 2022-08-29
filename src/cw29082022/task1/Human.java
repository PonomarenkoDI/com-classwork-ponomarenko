package cw29082022.task1;

import cw29082022.task5.Book;
import cw29082022.task6.Car;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {

    private String nameSurnamePatronymic;
    private LocalDate dateBorn;
    private long numberPhone;
    private String city;
    private String country;
    private String addressHome;

    private Car [] car1;
    private Book[] book1;

    public Human(String nameSurnamePatronymic, LocalDate dateBorn) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.dateBorn = dateBorn;
    }

    public Human(String nameSurnamePatronymic, LocalDate dateBorn, long numberPhone, String city) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.dateBorn = dateBorn;
        this.numberPhone = numberPhone;
        this.city = city;
    }

    public Human(String nameSurnamePatronymic,
                 LocalDate dateBorn,
                 long numberPhone,
                 String city,
                 String country,
                 String addressHome,
                 Car [] car1,
                 Book[] book1) {
        this.nameSurnamePatronymic = nameSurnamePatronymic;
        this.dateBorn = dateBorn;
        this.numberPhone = numberPhone;
        this.city = city;
        this.country = country;
        this.addressHome = addressHome;
        this.car1 = car1;
        this.book1 = book1;
    }
}




