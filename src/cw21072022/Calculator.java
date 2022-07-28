import java.util.Scanner;

public class Calculator {
    static Scanner calcul = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator n = new Calculator();
        int n1 = n.creatCalculator();
        int n2 = n.creatCalculator2();
        char operation = showOperation();
        int itog = n.calculatorDeist(n1, operation, n2);
        System.out.println("Itog: " + itog);
    }

    public int creatCalculator() {
        System.out.print("Vvedite pervoe chislo: ");
        int one = calcul.nextInt();
        return one;
    }

    public int creatCalculator2() {
        System.out.print("Vvedity vtoroe chislo: ");
        int two = calcul.nextInt();
        return two;
    }

    public static char showOperation() {
        System.out.println("Vviberity number operation iz list: ");
        System.out.println("1-slogenie");
        System.out.println("2-vichitanie");
        System.out.println("3-delenie");
        System.out.println("4-umnogenie");
        System.out.println("Ukagite number operation: ");
        int number = calcul.nextInt();
        char operation;
        operation = showOperation();
        return operation;
    }

    public int calculatorDeist(int n1, char operation, int n2) {
        int itog;
        switch (operation) {
            case '+':
                itog = n1 + n2;
                break;
            case '-':
                itog = n1 - n2;
                break;
            case '*':
                itog = n1 * n2;
                break;
            case '/':
                itog = n1 / n2;
                break;
            default:
                itog = calculatorDeist(n1, showOperation(), n2);
        }
        return itog;
    }
}
