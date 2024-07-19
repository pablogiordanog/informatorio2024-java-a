package estructurada.practico02.iniciado;

/**
 * 1. Triangulo de asteriscos : Se le solicita que creen un programa que imprima
 * un triángulo de asteriscos en la consola. Usar bucles.
 */

public class TrianguloAsterisco {
    public static void main(String[] args) {
        int numFilas = 10;
        for (int i = 1; i <= numFilas; i++) {
            // Bucle para imprimir asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}