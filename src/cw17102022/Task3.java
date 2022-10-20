package cw17102022;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] array1 = {2, 5, 8, 11};
        int[] array2 = {6, 55, 8, 10};

        int[] array3 = null;
        int[] array4 = {7, 8, 66};

        int[] array5 = {88, 99, 80};
        int[] array6 = {87, 7};
        task3.exeptionArrays(array1, 3, 2, array2, 2, 1);
        task3.exeptionArrays(array3, 0, 2, array4, 0, 1);
        task3.exeptionArrays(array5, 0, 8, array6, 1, 0);
    }

    public void exeptionArrays(int[] a, int aFromIndex, int aToIndex,
                               int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (IllegalArgumentException e) {
            System.err.println("Hello from IllegalArgumentException");
        } catch (NullPointerException e) {
            System.err.println("Hello from NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hello from ArrayIndexOutOfBoundsException");
        }
    }
}
