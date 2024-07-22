package estructurada.practico02.caballero;

/**
 * 2. Dame los mayores y los menores :
 * Realizar un programa donde se guarden 5 en un arreglo. Luego,
 * el programa debe mostrar en pantalla el valor máximo y mínimo de los números ingresados.
 */

public class MayoresYMenores2 {
    public static void main(String[] args) {
        int[] arrNumeros    = {2, 8, -1, 20, 10, 22, 11, 45};
        int min = 0;
        int max = 0;
        for(int i=0;i<arrNumeros.length;i++){
            int numero = arrNumeros[i];
            if(numero<min){
                min = numero;
            }
            if(numero>max){
                max = numero;
            }
        }
        System.out.println("El valor mínimo es " + min + ".");
        System.out.println("El valor máximo es " + max + ".");
    }
}
