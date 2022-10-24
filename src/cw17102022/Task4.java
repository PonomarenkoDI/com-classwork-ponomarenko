package cw17102022;

import java.util.Scanner;

public class Task4 {
    int[] array;

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.getText();
        task4.summNumber();

    }

    public void getText() {
        Scanner s = new Scanner(System.in);
        String a = null;
        try {
            System.out.println("Введите выражение: ");
            a = s.nextLine();
            String[] num = a.split("\\+");
            splitMethod(num);
            } catch (NumberFormatException ex) {
            System.out.println("Вы ввели не число!");
            getText();
        }

    }

    public void summNumber() {
        int summ = 0;
        for (int i : array) {
            summ += i;
        }
        System.out.println("Сумма равна: "+ summ);
    }

    public void splitMethod(String[] num) {
        array = new int[num.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(num[i]);

        }
    }
}



