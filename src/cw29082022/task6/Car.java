package cw29082022.task6;

import java.util.Scanner;

public class Car {
    private String nameCar;
    private String nameManufacturer;
    private int yearBornCar;
    private double engineVolume;

    private Scanner sc = new Scanner(System.in);

    public Car(String nameCar, String nameManufacturer) {
        this.nameCar = nameCar;
        this.nameManufacturer = nameManufacturer;
    }

    public Car(String nameCar, String nameManufacturer, int yearBornCar) {
        this.nameCar = nameCar;
        this.nameManufacturer = nameManufacturer;
        this.yearBornCar = yearBornCar;
    }

    public Car(String nameCar, String nameManufacturer, int yearBornCar, double engineVolume) {
        this.nameCar = nameCar;
        this.nameManufacturer = nameManufacturer;
        this.yearBornCar = yearBornCar;
        this.engineVolume = engineVolume;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar() {
        System.out.println("Введите название автомобиля: ");
        this.nameCar = sc.nextLine();
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer() {
        System.out.println("Введите название производителя: ");
        this.nameManufacturer = sc.nextLine();
    }

    public int getYearBornCar() {
        return yearBornCar;
    }

    public void setYearBornCar() {
        System.out.println("Введите год выпуска автомобиля: ");
        this.yearBornCar = sc.nextInt();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume() {
        System.out.println("Введите объем двигателя автомобиля: ");
        this.engineVolume = sc.nextDouble();
    }
}
