package cw31102022;


import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> hash = new HashSet();
        hash.add("hello");
        hash.add("bye");
        hash.add("good");


        hash.add(null);

        hash.add("bad");

        Task3 task3 = new Task3();
        task3.showArr((HashSet<String>) hash);
    }

    public void showArr(HashSet<String> hash){
        for (String s: hash) {
            System.out.println(s);
        }

    }
}
