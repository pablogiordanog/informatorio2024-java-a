package estructurada.practivo02.iniciado;

import java.util.Scanner;

/**
 * 7. Espero aprobar : Escribe un programa que imprima un título para el programa,
 * luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes,
 * donde los N números son guardados en variables o constantes según corresponda.
 * Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con cuanto
 */

public class Aprobar {
    public static void main(String[] args) {
        System.out.println("Titulo de Programa");
        System.out.println("------------------");
        double nota = 1;
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[0];
        while (nota!=0){
            System.out.print("Ingrese Nueva Nota / para salir ingrese 0(cero):");
            nota = scanner.nextDouble();
            if(nota!=0.0d){
                int len = notas.length;
                len = notas.length + 1;
                if (len == 1) {
                    notas = new double[len];
                    notas[len - 1] = nota;
                } else {
                    //Guardo en un array auxiliar para no perder los datos previamente ingresados
                    int anchoTotal = notas.length + 1;
                    double[] notasTmp = new double[anchoTotal];
                    for (int indexTmp = 0; indexTmp < notas.length; indexTmp++) {
                        notasTmp[indexTmp] = notas[indexTmp];
                    }
                    //agrego ultima nota
                    notasTmp[anchoTotal - 1] = nota;
                    int lenNuevo = notasTmp.length;
                    //cargo nuevamente en el array original reestructurado
                    notas = new double[lenNuevo];
                    for (int index = 0; index < notasTmp.length; index++) {
                        notas[index] = notasTmp[index];
                    }
                }
            }
        }
        scanner.close();
        System.out.println("");
        String notasText = "";
        double sumaDeNotas = 0;
        for(int index=0;index<notas.length;index++){
            notasText = notasText + " Nota " + (index+1) + " : " + notas[index];
            sumaDeNotas = sumaDeNotas + notas[index];
        }
        double promedio = sumaDeNotas / notas.length;
        System.out.println("Las notas son :" + notasText);
        System.out.println("El promedio es :" + promedio);
    }
}
