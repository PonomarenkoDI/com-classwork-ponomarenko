package cw21072022;

import java.util.Arrays;

public class Task2 {

    public int[] crateArray() {
        int[] array;
        array = new int[12];
        int numbe1 = 15;
        int number2 = -15;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - numbe1)) + numbe1);
        }
        return array;
    }
    public static void main(String[] args) {
        Task2 n = new Task2();
        int[] arr = n.crateArray();
        n.showArray(arr);
        int max = n.maxArray(arr);
        System.out.println(max);
    }

    public void showArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public int maxArray (int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}









