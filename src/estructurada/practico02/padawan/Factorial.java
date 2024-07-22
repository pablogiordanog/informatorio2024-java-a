package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 3. El factorial : Realizar un programa que calcule el factorial de un número
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + number + " es " + factorial);
    }
}
