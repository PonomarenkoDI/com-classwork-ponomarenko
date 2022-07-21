import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[8];
        int numbe1 = 1;
        int number2 = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - numbe1)) + numbe1);
            System.out.print(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

