package estructurada.practico02.caballero;

/**
 * 1. Dame los mayores y los menores : Dado un arreglo con valores enteros,
 * realice la búsqueda de ese entero, si encontró el entero mostrarlo
 * por pantalla sino muestre por pantalla que no lo encontró.
 */

public class MayoresYMenores {
    public static void main(String[] args) {
        int[] arrNumeros    = {2, 8, 1, 20, 10, 22, 11, 45};
        int numeroEncontrar = 8;
        boolean isBuscar    = arrNumeros.length>0;
        boolean isEsta      = false;
        int i = 0;
        while (isBuscar && i<arrNumeros.length){
            if(numeroEncontrar==arrNumeros[i]){
                isBuscar = false;
                isEsta   = true;
            }
            i++;
        }
        if(isEsta){
            System.out.println("El número " + numeroEncontrar + " esta en la lista.");
        }else{
            System.out.println("Número " + numeroEncontrar + " No encontrado.");
        }

    }
}
