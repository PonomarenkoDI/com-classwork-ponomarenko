package cw17102022;

import java.util.Scanner;

public class Task2 {
    Integer number = 0;

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getText();
        task2.veryfyRange();
        System.out.println(task2.number + " число в диапазоне");
    }


    public void getText() {
        Scanner s = new Scanner(System.in);
        String a = null;
        try {
            System.out.println("Введите число: ");
            a = s.nextLine();
            number = Integer.parseInt(a, 2);
        } catch (NumberFormatException e) {
            System.out.println(a + " вне диапазоне");
            getText();
        }
    }

    public void veryfyRange() {
        try {
            proverDiapazon();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            getText();
            veryfyRange();
        }
    }

    public void proverDiapazon() throws IllegalArgumentException {
        if (number <= -5 ||  number >= 5) {
            throw new IllegalArgumentException("Число в не диапазоне");
        }
}
}
