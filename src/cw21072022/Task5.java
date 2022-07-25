import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Vvedite razmer array bolhe number 3: ");
        int array = num.nextInt();
        int n;
        n = array;
        int[] array1 = {n};
        if (n < 3) {
            System.out.print("Number ne sootvetstvuet zaprosy. Povtorite zapros ");
        } else {
            System.out.println("Razmer massiva raven: " + n);
        }
        int[] array2;
        array2 = new int[n];
        int number1 = 0;
        int number2 = n;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i] = ((int) (Math.random() * (number2 - number1)) + number1);
            System.out.print(array2[i]);
        }
        {
            System.out.println();
        }
        int[] array3;
        array3 = new int[n];
        int number = 0;
        for (int i = 0; i < n; i++) {
            if (array2[i] % 2 == 0) {
                array3[number] = array2[i];
                number++;
            }
            System.out.println(Arrays.toString(array3));
        }
    }
}