package cw01082022;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String number = "";
        for (int i = 1; i < 1000; i++) {
            if (number.length() >= 1000) {
                break;
            } else {
                number = number + i;
            }
        }
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(number.charAt(index));
    }
}
