package cw03112022;

import java.util.LinkedList;
import java.util.List;

public class Exemple {


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(8);

        for (Integer i:list) {
            System.out.println(i);
        }
        System.out.println("razmer: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 6){
                list.remove(i);
            }
            System.out.println(list);

        }

    }
}
