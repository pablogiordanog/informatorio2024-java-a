package poo.practico03.caballero;

import poo.practico03.padawan.Calificacion;
import poo.practico03.padawan.Estudiante;

import java.util.*;

public class AppEjercicio1 {

    static void opciones(){
        System.out.println("Menú de Opciones");
        System.out.println("=================");
        System.out.println("1-Ingresar Diccionario");
        System.out.println("2-Buscar Palabra");
        System.out.println("0-Terminar");
    }

    static Map<String, Palabra> ingresarPalabras(){
        Map<String, Palabra> palabras = new HashMap<String, Palabra>();
        System.out.println("Ingrese Nuevas Palabras");
        System.out.println("=======================");

        String terminar = "N";
        while(!terminar.equals("S")){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Palabra:");
            String palabra = scanner.next();

            System.out.print("Definición:");
            String definicion = scanner.next();

            if(palabras.containsKey(palabra)){
                System.out.println("Se ingreso con anterioridad la palabra:" + palabra + "!");
                System.out.println("Palabra no ingresada!");
            }else{
                Palabra palabraItem = new Palabra(palabra,definicion);
                palabras.put(palabra, palabraItem);

                System.out.println("Desea Salir (S/N)?");
                terminar = scanner.next();
            }
        }
        return palabras;
    }

    static Diccionario ingresarPorTecladoDiccionario(List<Diccionario> listDiccionario){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Diccionario");
        System.out.println("====================");

        System.out.print("Nombre:");
        String nombre = scanner.next();

        Diccionario diccionario = new Diccionario(nombre);
        Map<String,Palabra> palabraMap = ingresarPalabras();
        diccionario.setPalabras(palabraMap);

        listDiccionario.add(diccionario);

        return diccionario;
    }

    static void buscarPalabra(List<Diccionario> listDiccionario){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buscar palabra en Diccionario");
        System.out.println("=============================");

        System.out.print("Palabra:");
        String palabra = scanner.next();

        if(palabra.isBlank()){
            System.out.println("No ha ingresado palabra para buscar.");
        }else {
            int encontrados = 0;
            for (int i = 0; i < listDiccionario.size(); i++) {
                Palabra palabraEncontrada = listDiccionario.get(i).buscarPalabra(palabra);
                if(!palabraEncontrada.getPalabra().trim().isBlank()){
                    encontrados = encontrados + 1 ;
                    System.out.println(palabraEncontrada.toString());
                }
            }
            System.out.println("Fin de busqueda de " + palabra + " con " + encontrados + " aciertos.");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Diccionario> diccionariosList = new ArrayList<Diccionario>();
        int opcion = 1;
        while (opcion!=0){
            opciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:break;
                case 1://Ingresar Diccionario
                    ingresarPorTecladoDiccionario(diccionariosList);
                    break;
                case 2://Buscar palabra
                    buscarPalabra(diccionariosList);
                    break;
                default:break;
            }
        }
        scanner.close();
    }
}
