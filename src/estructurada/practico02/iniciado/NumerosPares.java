package estructurada.practico02.iniciado;

import java.util.Scanner;

/**
 * 6. A mi me gustan los pares: Escribe un programa que imprima
 * solo los N números pares, donde los N números son guardados
 * en variables o constantes según corresponda.
 */

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero N: ");
        int N = scanner.nextInt();

        // Imprimir los primeros N números pares
        System.out.println("Los primeros " + N + " números pares son:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i * 2);
        }
        scanner.close();
    }
}
