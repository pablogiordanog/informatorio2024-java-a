package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 12. Yo elijo el equipo ganador : Modifique el ejercicio anterior
 * en donde usted debe crear un menú de opciones en donde en ese menú
 * de opciones debe elegir qué equipo de fútbol quiere
 * saber la información del el ejercicio 11.
 */

public class ElijoGanador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTerminar = false;
        String equipo1 = "Boca Junior";
        String equipo2 = "River Plate";
        String opcionSeleccionada = "";
        int opcion = 0;
        do {
            System.out.println("Lista de Equipos");
            System.out.println("----------------");
            System.out.println("1." + equipo1);
            System.out.println("2." + equipo2);
            System.out.println("3.Salir");
            System.out.print("Seleccione Equipo Ganador:");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    opcionSeleccionada = equipo1 + " fue el equipo ganador";
                    isTerminar = true;
                    break;
                case 2:
                    opcionSeleccionada = equipo2 + " fue el equipo ganador";
                    isTerminar = true;
                    break;
                case 3:
                    opcionSeleccionada = "Salir, no huvo equipo ganadore";
                    isTerminar = true;
                    break;
                default:
                    opcionSeleccionada = "Seleccion incorrecta, opcion no definida.";
                    break;
            }
            System.out.println(opcionSeleccionada);
            System.out.println("");
        }while(!isTerminar);
    }
}
