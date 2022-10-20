package cw17102022;

import java.util.Scanner;

public class Task1 {
    Integer number = 0;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.getText();
        task1.veryfyRangt();
        System.out.println(task1.number + " число в диапазоне");
    }

    public void getText() {
        Scanner s = new Scanner(System.in);
        String a = null;
        try {
            System.out.println("Введите число: ");
            a = s.nextLine();
            number = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println(a + " вне диапазоне");
            getText();
        }
    }

    public void veryfyRangt() {
        try {
            proverDiapazon();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getText();
            veryfyRangt();
        }

    }

    public void proverDiapazon() throws IllegalArgumentException {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("Число в не диапазоне");
        }
    }
}
