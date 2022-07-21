import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Введите несколько слов для подсчёта: ");
        String howMany = word.nextLine();
        int kolichestvo = 0;
        if (howMany.length() != 0) {
            kolichestvo++;
            for (int i = 0; i < howMany.length(); i++) {
                if (howMany.charAt(i) == ' ') {
                    kolichestvo++;
                }
            }
        }
        if (howMany.charAt(howMany.length() - 1) == ' ') {
            kolichestvo--;
        }
        System.out.println("Количество введенных слов: " + kolichestvo);
    }
}


