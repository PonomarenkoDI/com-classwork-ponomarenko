package cw01082022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String text = s.nextLine();
        String[] arr = text.split(" ");
        int [] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i].length();
        }
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        System.out.println(summa/arr.length);
    }
}

