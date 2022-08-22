package cw21072022;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] intArray;
        intArray = new int[8][5];
        int number = 10;
        int number2 = 99;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                intArray[i][j] = intArray[i][j] = ((int) (Math.random() * (number2 - number)) + number);
                System.out.print(intArray[i][j] + " ");
            }
            {
                System.out.println();
            }
        }
    }
}

        



