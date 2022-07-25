public class task4 {
    public static void main(String[] args) {
        int[] array;
        int [] array1;
        array = new int[5];
        array1 = new int [5];
        int numbe1 = 0;
        int number2 = 5;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] = ((int) (Math.random() * (number2 - numbe1)) + numbe1);
            System.out.print(array[i]);
        }
            System.out.println();
        for (int j = 0; j < array1.length; j++) {
                array1[j] =  array[j] = ((int) (Math.random() * (number2 - numbe1)) + numbe1);
                System.out.print(array[j]);
        }
        System.out.println();

        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < 5; i++) {
            sum += array[i];
            sum1 += array1[i];
            sum /=5;
            sum1 /=5;
        }
        if (sum > sum1) {
            System.out.println("Среднее арифметическое первый массив" + sum + "Больше второго " + sum1);
        } else if (sum < sum1) {
            System.out.println("Среднее арифметическое первый массив" + sum + "Меньше второго " + sum1);
        } else {
            System.out.println("Среднее арифметическое первого массива и второго равны"  );
        }

    }
}
