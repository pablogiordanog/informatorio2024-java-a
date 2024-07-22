package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 4. Suma del rango de números : Escribir un programa que encuentre la suma de los
 * números impares en un rango de números enteros guardados en una variable.
 */

public class SumaRangoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor mínimo:");
        int min = scanner.nextInt();

        System.out.println("Ingrese el valor máximp:");
        int max = scanner.nextInt();

        int sumaNrosImpares = 0;
        for(int i=min; i<=max; i++){
            if (i % 2 !=0 ){ //si el calculo del resto es diferente de 0 es impar
                sumaNrosImpares = sumaNrosImpares + i;
            }
        }
        System.out.println("La suma de números impares del rango de " + min + " al " + max + " es de " + sumaNrosImpares + ".");
    }
}
