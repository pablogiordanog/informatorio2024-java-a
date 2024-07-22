package estructurada.practico02.maestro;

/**
 * 3. Unión de dos arreglos :
 * Dado dos arreglos con cualquier tipo de valor
 * (Ya sea String, Char, Integer, etc), realice la unión de ambos arreglos en un tercer arreglo.
 */

public class UnionDosArreglos {
    public static void main(String[] args) {
        int[] arr01 = {9, 3, 8, 4, 10};
        char[] arr02 = {'A', 'h', 'L', 'J'};
        int maxLongitud = arr01.length + arr02.length;
        String[] arrUnion = new String[maxLongitud];
        int indexUnion = 0;
        //Union de primer arreglo
        for(int i=0;i<arr01.length;i++){
            arrUnion[i] = String.valueOf(arr01[i]);
            indexUnion = i;
        }
        //Union de segundo arreglo
        indexUnion++;
        for(int j=0;j<arr02.length;j++){
            arrUnion[indexUnion] = String.valueOf(arr02[j]);
            indexUnion++;
        }
        //Imprimir tercer arreglo
        for(int z=0;z<arrUnion.length;z++){
            System.out.println("Valor " + arrUnion[z]);
        }
    }
}
