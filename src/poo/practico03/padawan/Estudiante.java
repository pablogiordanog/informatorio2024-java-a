package poo.practico03.padawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {

    private int id;
    private String nombre;
    private List<Calificacion> calificaciones;

    public Estudiante(int id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        this.setCalificaciones(new ArrayList<Calificacion>());
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Estudiante e = (Estudiante) o;
        boolean isOk = this.getId()==e.getId();
        return isOk;
    }

    @Override
    public String toString(){
        return "ID: " + this.getId() + ", Nombre: " + this.getNombre();
    }

    public void agregarCalificacion(Calificacion calificacion){
        this.getCalificaciones().add(calificacion);
    }

    public double getPromedio(){
        double sumaNotas = 0;
        for(int i=0;i<getCalificaciones().size();i++){
            Calificacion cal = getCalificaciones().get(i);
            sumaNotas = sumaNotas + cal.getCalificacion();
        }
        double promedio = sumaNotas / getCalificaciones().size();
        return promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
