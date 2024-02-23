package calculatrice;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        String operation;
        double resultat;

        System.out.println("Entrez le premier nombre :");
        a = scanner.nextDouble();

        System.out.println("Entrez le deuxieme nombre :");
        b = scanner.nextDouble();

        System.out.println("Entrez l'operation a effectuer (+, -, *, /) :");
        operation = scanner.next();

        switch (operation) {
            case "+":
                resultat = calculatrice.addition(a, b);
                break;
            case "-":
                resultat = calculatrice.soustraction(a, b);
                break;
            case "*":
                resultat = calculatrice.multiplication(a, b);
                break;
            case "/":
                try {
                    resultat = calculatrice.division(a, b);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Operation invalide.");
                return;
        }

        System.out.println("Resultat : " + resultat);
    }
}
