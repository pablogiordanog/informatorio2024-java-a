package estructurada.practico02.padawan;

import java.util.Scanner;

/**
 * 8. Mis amigos y su edad: Guarda en variables el nombre de N cantidad de amigos,
 * itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si
 * este amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
 * diciendole a ese amigo porque no lo muestra por pantalla.
 */

public class MisAmigos {
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
        int mayor = 18;
        for(int indexA=0;indexA<amigos.length;indexA++){
            int edad = Integer.valueOf(edades[indexA]);//Converir valor String a valor de tipo numerico
            if(edad>=mayor) {
                System.out.println("Amigo " + amigos[indexA]);
            }else{
                System.out.println("Eres menor de edad");
            }
        }

    }
}
