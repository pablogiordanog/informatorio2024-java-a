package estructurada.practico02.maestro;

import java.util.Scanner;

/**
 * 7. Yo elijo el equipo ganador mejorado:
 * A partir del ejercicio número 12 del nivel de Padawan Jedi mejorelo usando arreglos.
 */

public class EquipoGanador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] equipos = {"Boca Junior", "River Plate", "Talleres de Córdoba"};
        boolean isTerminar = false;
        String opcionSeleccionada = "";
        int opcion = 0;
        do {
            System.out.println("Lista de Equipos");
            System.out.println("----------------");
            for(int i=0;i<equipos.length;i++){
                System.out.println(i+1 + " ) " + equipos[i]);
            }
            System.out.print("Seleccione Equipo Ganador:");
            opcion = scanner.nextInt() - 1;
            if(opcion>=0 && opcion< equipos.length){
                opcionSeleccionada = equipos[opcion] + " fue el equipo ganador";
                isTerminar = true;
            }else{
                opcionSeleccionada = "Seleccion incorrecta, opcion no definida.";
            }
            System.out.println(opcionSeleccionada);
            System.out.println("");
        }while(!isTerminar);
    }
}
