package cw29082022.task4;

public class Calculator {
    private double x;
    private double y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Calculator() {
        this.x = x;
        this.y = y;
    }

    public double plus() {
        return x + y;
    }

    public double minus() {
        return x - y;
    }

    public double multiplication() {
        return x * y;
    }

    public double division() {
        return x / y;
    }

    public double plus (double x, double y){
        return x+y;
    }
    public double minus (double x, double y){
        return x-y;
    }
    public double multiplication (double x, double y){
        return x*y;
    }
    public double division (double x, double y){
        return x/y;
    }
}
