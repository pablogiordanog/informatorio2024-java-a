package estructurada.practico02.caballero;

/**
 * 5. Restalos, prohibido menores a ceros :
 * Cree dos arreglos con números decimales,
 * luego recortarlos y reste ambos arreglos
 * el resultado aplicarlos a un tercer arreglo,
 * si la resta da negativo entonces guarde 0.
 */

public class Restarlos {
    public static void main(String[] args) {
        double[] arr01 = {16.4, 50.0, 80.61, 100.01, 300, 20.25};
        double[] arr02 = {15.5, 55.0, 80.51, 120, 20.0};

        //determino longitud de arreglo mas corto
        int longitud = Math.min(arr01.length, arr02.length);
        //defino arreglo de resultados
        double[] arr03Resultado = new double[longitud];

        for(int i = 0; i<arr03Resultado.length;i++){
            double resta = arr01[i] - arr02[i];
            if (resta < 0) {
                arr03Resultado[i] = 0;
            } else {
                arr03Resultado[i] = resta;
            }
        }

        System.out.println("Resultado");
        System.out.println("=========");
        for (double resultado:arr03Resultado){
            System.out.println("Resultado de resta " + resultado + ".");
        }
    }
}
