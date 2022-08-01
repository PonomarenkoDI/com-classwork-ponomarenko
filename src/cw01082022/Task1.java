package cw01082022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = s.nextLine();
        System.out.print("Введите символ: ");
        String symbol = s.nextLine();
        char [] arr = symbol.toCharArray();
        char a = symbol.charAt(0);
        int kolich = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                kolich++;
            }
            System.out.println(kolich);
        }
        }
    }

