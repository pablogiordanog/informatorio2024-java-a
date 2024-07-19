package estructurada.practivo02.iniciado;

import java.util.Scanner;

/**
 * 5. La suma de los primeros: Realizar un programa que calcule
 * la suma de los primeros N números naturales,
 * donde N es un número entero guardado en memoria.
 */

public class SumaPrimeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero N: ");
        int N = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);

        scanner.close();
    }

}
