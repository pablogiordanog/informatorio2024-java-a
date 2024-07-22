package estructurada.practico02.padawan;

/**
 * 6. Y mas... sumas! : Realizar un programa donde se guarde un número entero en una
 * variable y que imprima por pantalla el resultado de la suma de todos los números
 * enteros desde 1 hasta ese número.
 */

public class Sumas {
    public static void main(String[] args) {
        int numero = 15;
        for(int i=0;i<=numero;i++){
            int suma = 0;
            for(int j=0;j<=i;j++){
                suma = suma + j;
            }
            System.out.println("Suma de " + i + " es igual a " + suma + ".");
        }
    }
}
