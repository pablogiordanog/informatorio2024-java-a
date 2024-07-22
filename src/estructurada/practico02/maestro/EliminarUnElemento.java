package estructurada.practico02.maestro;

/**
 * 1. Eliminación de un elemento:
 * Dado un arreglo con valores enteros,
 * realice la búsqueda de ese entero
 * y si lo encuentra eliminarlo,
 * si no lo encuentra informe por pantalla.
 */

public class EliminarUnElemento {
    public static void main(String[] args) {
        int[] arrBuscar = {10, 1, 4, 8, 20, 100, 78};
        int numeroBuscar = 90;
        int indexEsta = -1;
        for(int i=0;i<arrBuscar.length;i++){
            int numero = arrBuscar[i];
            if(numero==numeroBuscar){
                indexEsta = i;
                break;
            }
        }
        if(indexEsta!=-1){
            int[] nuevoArray = new int[arrBuscar.length - 1];
            int j = 0;
            for(int i=0;i<arrBuscar.length;i++){
                if(i!=indexEsta){
                    nuevoArray[j++]= arrBuscar[i];
                }
            }

            for(int i=0;i<nuevoArray.length;i++){
                System.out.println("Número " + nuevoArray[i]);
            }
        }else{
            System.out.println("El numero " + numeroBuscar + " no esta.");
        }

    }
}
