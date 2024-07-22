package estructurada.practico02.caballero;

import java.util.Scanner;

/**
 * 3. Mis amigos, su edad y el mayor :
 * Guarda en un arreglo una N cantidad de amigos,
 * itere sobre esa cantidad mostrando el nombre de cada
 * amigo si y sólo si este amigo es mayor de edad, en caso de
 * ser menor de edad imprima un mensaje diciendole a ese amigo
 * porque no lo muestra por pantalla. Pero a su vez, encuentre
 * al amigo que mayor edad tenga, muestre un mensaje por
 * pantalla del nombre de esa persona y su edad.
 */

public class MisAmigosEdadElMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombresAmigos = "";
        String edadesAmigos = "";
        String salir = "N";
        do {
            System.out.print("Ingrese el nombre del amigo:");
            String nombre = scanner.next();
            nombresAmigos = nombresAmigos + nombre + "|";

            System.out.print("Ingrese Edad de " + nombre + ":");
            int edad = scanner.nextInt();
            edadesAmigos = edadesAmigos + edad + "|";

            System.out.println("Desea Terminar? presione S");
            salir = scanner.next().trim();
        }while (!salir.equals("S"));


        String[] amigos = nombresAmigos.split("[|]");//Genera array
        String[] edades = edadesAmigos.split("[|]");

        System.out.println("Listar Amigos");
        int mayor           = 18;
        String amigoLongevo = "";
        int masLongevo      = 0;
        for(int indexA=0;indexA<amigos.length;indexA++){
            int edad = Integer.valueOf(edades[indexA]);//Converir valor String a valor de tipo numerico
            if(edad>=mayor) {
                System.out.println("Amigo " + amigos[indexA]);
            }else{
                System.out.println("Eres menor de edad");
            }
            if(edad>masLongevo){
                amigoLongevo = amigos[indexA];
                masLongevo   = edad;
            }
        }
        System.out.println("El amigo mas longevo es " + amigoLongevo + " con " + masLongevo + " años de edad.");
    }
}
