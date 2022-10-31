package cw31102022;

import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(77);
        arrayList.add(8);

        arrayList.add(2,5);

        arrayList.add(null);

        Task1 task1 = new Task1();
        task1.showArr(arrayList);

    }
    public void showArr (List<Integer> arrayList){
        for (Integer i: arrayList) {
            System.out.println(i);
        }

    }
}

