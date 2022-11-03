package cw03112022;
import java.util.*;

public class Task1 {
    private List<Integer> list = new ArrayList<>();
    private Map<Integer, String> map = new HashMap<>();
    private boolean endFlag =

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.list.add(task1.scan());
        task1.list.add(task1.scan());
        task1.list.add(task1.scan());

        task1.creatMenu();
        task1.showMenu();

        do {
            task1.creatMenu();
        } while ()
    }

    public int scan() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public void creatMenu() {
        map.put(1, "Добавить элемент в список");
        map.put(2, "Удалить элемент из списка");
        map.put(3, "Показать содержимое списка");
        map.put(4, "Проверить есть ли значение в списке");
        map.put(5, "Заменить значение в списке");
        map.put(6, "Выход");
    }

    public void showMenu() {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(i + "." + map.get(i));

        }
    }

    public int getMenuPoint() {
        System.out.println("Введите пункт меню: ");
        return new Scanner(System.in).nextInt();
    }

    public void creatSwitch() {
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 1: {
                int newNumber = scan();
                list.add(newNumber);
                break;
            }
            case 3: {
                showScanEntries();
                break;
            }
            case 6: {
                endFlag = false;
            }
            case 2: {
                int removedNumber = scan();
                deletNumber(removedNumber);
                showScanEntries();
                break;
            }
            case 4 : {
                scan();
                proverkaNumber();
                break;
            }

        }
    }

    public void showScanEntries() {
        for (Integer number : list) {
            System.out.print(number + ",");

        }
    }

    public void deletNumber(int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(number)) {
                list.remove(i);
            }

        }

    }
    public void proverkaNumber (){
        boolean isExists = list.contains(scan());
    }
}


