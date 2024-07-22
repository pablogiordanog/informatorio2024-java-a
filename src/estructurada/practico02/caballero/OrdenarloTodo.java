package estructurada.practico02.caballero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4. Ordenarlo todo :
 * Realizar un programa que guarde cierta cantidad
 * de números con punto decimal en un arreglo.
 * Luego, el programa debe ordenar los números de forma ascendente y mostrarlos en pantalla.
 */

public class OrdenarloTodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingrese numero " + (i+1) + " de " + numeros.length + " :");
            numeros[i] = scanner.nextDouble();
        }
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.println("Numero " + numeros[i]);
        }
    }
}
