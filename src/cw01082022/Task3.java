package cw01082022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 m = new Task3();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String text = s.nextLine();
        String[] arr = text.split(" ");
        int[] number = m.creatArr(arr);
        int summ = m.podshiotSumm(number);
        System.out.println(summ / arr.length);

    }

    public int[] creatArr(String[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i].length();
        }
        return array;
    }

    public int podshiotSumm(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        return summa;
    }
}


