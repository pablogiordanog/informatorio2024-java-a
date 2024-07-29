package poo.practico03.caballero;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppEjercicio3 {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Galaza, Juan");
        Autor autor2 = new Autor("Aguilar, Walter");
        Autor autor3 = new Autor("Marquez, Luis");

        Libro libro1 = new Libro("Programing Java", autor2, 3);
        Libro libro2 = new Libro("POO", autor1, 1);
        Libro libro3 = new Libro("Aprendiendo a sembrar", autor3, 2);
        Libro libro4 = new Libro("Nada es lo que parece", autor2, 1);

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Pibernus");
        System.out.println(biblioteca1.registarLibro(libro1));
        System.out.println(biblioteca1.registarLibro(libro2));
        System.out.println(biblioteca1.registarLibro(libro3));
        System.out.println(biblioteca1.registarLibro(libro4));

        System.out.println("Buscar por titulo POO");
        System.out.println("=====================");
        System.out.println(biblioteca1.buscarLibro("POO").toString());
        System.out.println("");

        System.out.println("Buscar por Autor" + autor2.toString());
        System.out.println("=====================================");
        List<Libro> libros = biblioteca1.buscarLibro(autor2);
        for(Libro l:libros){
            System.out.println(l.toString());
        }
    }
}
