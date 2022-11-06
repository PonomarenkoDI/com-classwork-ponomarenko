package cw03112022;

import java.util.*;

public class Cw1 {
    private List<Integer> num = new LinkedList<>();
    private  Map<Integer, String> map = new HashMap<>();
    private boolean endFlag = true;

    public static void main(String[] args) {
        Cw1 task1 = new Cw1();

        task1.num.add(task1.poluchenieNumberFronUser());
        task1.num.add(task1.poluchenieNumberFronUser());
        task1.num.add(task1.poluchenieNumberFronUser());
        task1.createdMap();
        task1.showMap();



        do {
            task1.realizationMap();
        }while (task1.endFlag);
    }

    public int poluchenieNumberFronUser() {
        System.out.println("Vvedite number: ");
        return new Scanner(System.in).nextInt();
    }

    public void createdMap() {
        map.put(1, "Dobavit element in spisok");
        map.put(2, "Delete element in spisok");
        map.put(3, "Pokazat sodergimoe spiska");
        map.put(4, "Proverit esli znachenie v spiske");
        map.put(5, "Zamenit znechenie v spiske");
        map.put(6, "Exit");
    }

    public void showMap() {
        for (int i = 1; i < map.size()+1; i++) {
            System.out.println(i + "." + map.get(i));
        }
    }

    public int viborPunkta (){
        System.out.println("Viberite punkt is spiska: ");
        return new Scanner(System.in).nextInt();
    }

    public void realizationMap (){
        int menuPunkt = viborPunkta();
        switch (menuPunkt){
            case 1 :{
                int newNumber = poluchenieNumberFronUser();
                num.add(newNumber);
                break;
            }
            case 2 :{
                int delNum = poluchenieNumberFronUser();
                deletedElement(delNum);
                showList();
                break;
            }
            case 3 :{
                showList();
                break;
            }
            case 4 :{
                int numZnach = poluchenieNumberFronUser();
                proveritEsliZnachenie(numZnach);
                showList();
                break;
            }
            case 5: {
                zamenNum();
                showList();
                break;
            }
            case 6: {
                endFlag = false;
            }
        }

    }
    public void deletedElement (int number){
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == number)
                num.remove(i);
        }
    }

    public void showList (){
            for (Integer i:num) {
                System.out.print(i + " ");
            }
        }

    public void proveritEsliZnachenie (int numb){
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == numb){
                num.contains(i);
                System.out.println(true);
            }
            }
        }
    public void zamenNum(){
        System.out.println("Vvedite index number, kotori hotite deleted: ");
        Scanner index = new Scanner(System.in);
        int k = index.nextInt();
        System.out.println("Vvedite new number: ");
        Scanner number = new Scanner(System.in);
        Integer v = number.nextInt();
        num.set(k, v);
        }
    }



