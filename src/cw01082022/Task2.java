package cw01082022;

import java.util.Scanner;

public class Task2 {
    public String creatString() {
        String number = "";
        for (int i = 1; i < 1000; i++) {
            if (number.length() >= 1000) {
                break;
            } else {
                number = number + i;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Task2 n = new Task2();
        String num = n.creatString();
        n.showNumber(num);
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(num.charAt(index));
    }

    public void showNumber(String number) {
        System.out.println(number);
    }
}

