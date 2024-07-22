package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 10. Menú de opciones parte 2:
 * Realice un menú de opciones con bucle WHILE,
 * donde la opción se guarde en una variable (Sin pedir por teclado),
 * muestre la opción elegida y fuerce su salida bucle.
 */

public class MenuOpcionesDos {
    public static void main(String[] args) {
        boolean isTerminar = false;
        String opcionSeleccionada = "";
        int opcion = 2;
        while(!isTerminar) {
            System.out.println("Menu de Opciones");
            System.out.println("----------------");
            System.out.println("1.Articulos");
            System.out.println("2.Rubros");
            System.out.println("3.Marcas");
            System.out.println("4.Stock");
            System.out.println("5.Salir");
            System.out.print("Seleccione Opcion:");
            switch (opcion){
                case 1:
                    opcionSeleccionada = "Articulos";
                    isTerminar = true;
                    break;
                case 2:
                    opcionSeleccionada = "Rubros";
                    isTerminar = true;
                    break;
                case 3:
                    opcionSeleccionada = "Marcas";
                    isTerminar = true;
                    break;
                case 4:
                    opcionSeleccionada = "Stock";
                    isTerminar = true;
                    break;
                case 5:
                    opcionSeleccionada = "Salir";
                    isTerminar = true;
                    break;
                default:
                    opcionSeleccionada = "Seleccion incorrecta, opcion no definida.";
                    break;
            }
            System.out.println(opcionSeleccionada);
            System.out.println("");
        };
    }
}
