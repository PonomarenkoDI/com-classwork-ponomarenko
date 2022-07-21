public class Task2 {
    public static void main(String[] args) {
        int[] array;
        array = new int[12];
        int numbe1 = 15;
        int number2 = -15;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - numbe1)) + numbe1);
            System.out.println(array[i]);
            if (max > array[i]) ;
            max = array[i];
        }
        System.out.println("Максимальный элемент: " + max);
    }
}

