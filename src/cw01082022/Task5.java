package cw01082022;

import java.util.Scanner;

public class Task5 {
    public String[] getArrayWords(String str) {
        return str.split(" ");
    }

public String [] getArrWorlds (String str) {
    return str.split(":");
}


    public static void main(String[] args) {
        Task5 a = new Task5();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String [] words = a.getArrayWords(str);
        String [] words1 = a.getArrWorlds(str);

        char [] probel = 




    }
