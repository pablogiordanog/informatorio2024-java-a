package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 5. Positivos y divisibles por 7 : Realizar un programa que muestre por pantalla los
 * números enteros positivos que sean divisibles por 7 y que sean menores que 100.
 */

public class PositivosYDivisibles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        System.out.println("Operación con bucle for");
        for(int i=1;i<max;i++){
            double resto = i % 7;
            if(resto==0 && resto<100){
                System.out.println("Numero divisible por 7 y menor a " + max + " es: " + i + ".");
            }
        }
    }
}
