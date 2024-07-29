package poo.practico03.caballero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private String nombre;
    private Map<String, Libro> libros;

    public Biblioteca(String nombre){
        this.setNombre(nombre);
        this.setLibros(new HashMap<String, Libro>());
    }

    public boolean registarLibro(Libro libro){
        boolean siRegistro = true;
        if(getLibros().containsKey(libro.getTitulo())){
            siRegistro = false;
        }else{
            getLibros().put(libro.getTitulo(), libro);
        }
        return siRegistro;
    }

    public Libro buscarLibro(String titulo){
        Libro lib = null;
        if(getLibros().containsKey(titulo)){
            lib = getLibros().get(titulo);
        }else{
            lib = new Libro("",null, 0);
        }
        return lib;
    }

    public List<Libro> buscarLibro(Autor autor){
        List<Libro> librosList = new ArrayList<Libro>();
        for(Libro l:getLibros().values()){
            if(l.getAutor().equals(autor)){
                librosList.add(l);
            }
        }
        return librosList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Libro> getLibros() {
        return libros;
    }

    public void setLibros(Map<String, Libro> libros) {
        this.libros = libros;
    }
}
