import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 n = new Task7();
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite text: ");
        String text = sc.nextLine();
        text = text.replaceAll("[0-9]", "_");
        char[] s = text.toCharArray();
        int arr = n.workWithArrays(s);
        n.showResult(s);

    }

    public int workWithArrays(char[] s) {
        char c = 0;
        for (int i = 0; i < s.length; i++) {
            c = s[i];
            if (Character.isUpperCase(c)) {
                s[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                s[i] = Character.toUpperCase(c);
            }
        }
        return c;
    }

    public void showResult(char[] s) {
        System.out.println(new String(s));
    }

}


