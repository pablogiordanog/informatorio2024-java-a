package estructurada.practico02.caballero;

import java.util.Arrays;

/**
 * 4. Trasladar posiciones en un arreglo:
 * Dado un arreglo de enteros,
 * una posición del arreglo y la cantidad de N traslados a hacer en un arreglo.
 * Lo que debe hacer es tomar el elemento de la posición del arreglo
 * y trasladarlo N cantidad de veces,
 * si el traslado es mayor al tamaño del arreglo informar por pantalla.
 */

public class TransladarPosiciones {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicion = 3; // posicion del elemento a transladar
        int n = 5; // cantidad de translados
        int longitudArray = numeros.length;
        if(n>=longitudArray){
            System.out.println("El tamaño del arreglo es menor a la cantidad posicion de translado");
        }else{
            int[] arregloFinal = Arrays.copyOf(numeros, longitudArray);
            int elementoTransladar = arregloFinal[posicion];
            //translado el elemento N posiciones a la derecha
            for(int i=posicion;i<longitudArray;i++){
                if(i+n<longitudArray){
                    arregloFinal[i] = arregloFinal[i+n];
                }else{
                    arregloFinal[i] = 0;
                }
            }
            //Colocar el elemento en la nueva posicion
            if(posicion+n<longitudArray){
                arregloFinal[posicion+n] = elementoTransladar;
            }
            for(int i=0;i<arregloFinal.length;i++){
                System.out.println("Valor " + arregloFinal[i]);
            }
        }
    }
}
