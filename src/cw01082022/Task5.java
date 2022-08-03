import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite text sodergachi symbol probele ili dvoetochia: ");
        String text = sc.nextLine();
        String [] dlinna = text.split("[\\s:]");
        int a = 0;
        for (String s : dlinna) {
            if (s.length() % 2 == 0) {
                a++;
            }
        }
        System.out.println(a);
    }
}


