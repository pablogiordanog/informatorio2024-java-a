package estructurada.practico02.maestro;

/**
 * 5. Inversión de un arreglo:
 * Dado un arreglo de enteros inviertalo,
 * de tal manera que el primer elemento ahora sea el último y así sucesivamente.
 */

public class InversionArreglo {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for(int i=numeros.length - 1;i>=0;i--){
            System.out.println("Valor " + numeros[i]);
        }
    }
}
