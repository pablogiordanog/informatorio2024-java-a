package poo.ejercicios.tarea2;

import poo.ejercicios.tarea2.enumerations.ComplejidadEnum;

import java.util.*;

public class Curso {
    private UUID id;
    private String nombre;
    private Integer cantidadHoras;
    private ComplejidadEnum complejidad;
    private Map<Long, Estudiante> estudiantes = new TreeMap();
    private List<Examen> examenes = new ArrayList<>();

    @Override
    public String toString() {

        //Patron builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id :").append(this.getId()).append('\n')
                .append("Nombre :").append(this.getNombre()).append('\n')
                .append("Cantidad de horas :").append(this.getCantidadHoras()).append('\n')
                .append("Complejidad :").append(this.getComplejidad()).append('\n')
                .append("=====================================================").append('\n');

        return stringBuilder.toString();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(Integer cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public ComplejidadEnum getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(ComplejidadEnum complejidad) {
        this.complejidad = complejidad;
    }

    public Map<Long, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Map<Long, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }
}
