package poo.practico03.iniciado.diagramas;

import poo.practico03.iniciado.Alumno;

import java.util.List;
import java.util.Map;

public class Curso {
    private String nombre;
    private boolean esHabilitado;
    private String descripcion;
    private Map<String,Alumno> alumnos;

    public Curso(String nombre, boolean isHabilitado, String descripcion, Map<String,Alumno> alumnos){
        this.setNombre(nombre);
        this.setEsHabilitado(isHabilitado);
        this.setDescripcion(descripcion);
        this.setAlumnos(alumnos);
    }

    @Override
    public String toString(){
        return "Curso:" + this.getNombre() + " " +(this.isEsHabilitado()?"Habilitado":"Deshabilitado") + " " + this.getDescripcion() + " Con " + this.getAlumnos().size() + " Alumnos";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsHabilitado() {
        return esHabilitado;
    }

    public void setEsHabilitado(boolean esHabilitado) {
        this.esHabilitado = esHabilitado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<String, Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<String, Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
