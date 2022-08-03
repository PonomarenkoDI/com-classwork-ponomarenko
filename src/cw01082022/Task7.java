import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite text: ");
        String text = sc.nextLine();
        String num = "";
        text = text.replaceAll("[0-9]", "_");
        char[] s = text.toCharArray();

        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (Character.isUpperCase(c)) {
                s[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                s[i] = Character.toUpperCase(c);
            }
        }
        System.out.println(new String(s));
    }
}


