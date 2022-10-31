package cw31102022;


import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> linked = new LinkedList<>();
        linked.add(8);
        linked.add(10);
        linked.add(5);
        linked.add(7);

        linked.add(3,100);

        linked.add(null);

        Task2 task2 = new Task2();
        task2.showArr(linked);
    }

    public void showArr (List<Integer> linked) {
        for (Integer i: linked) {
            System.out.println(i);
        }
    }
}

