
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi izraz:");
        String expression = scanner.nextLine();

        String result = Calculator.Run(expression);
        System.out.println("Rezultat: " + result);
    }
}