package cw01082022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 n = new Task1();
        Scanner s = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = s.nextLine();
        System.out.print("Введите символ: ");
        String symbol = s.nextLine();
        char a = symbol.charAt(0);
        char[] arr = symbol.toCharArray();
        int kolich = n.kolichestvoSovpad(arr, a);
        System.out.println(kolich);

    }

    public int kolichestvoSovpad(char[] arr, char a) {
        int kolich = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                kolich++;
            }
        }
        return kolich;
    }
}



