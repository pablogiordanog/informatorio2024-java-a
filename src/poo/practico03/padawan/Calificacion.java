package poo.practico03.padawan;

import java.time.LocalDate;

public class Calificacion {

    private double calificacion;
    private LocalDate fechaCalificacion;

    public Calificacion(double calificacion){
        this.setCalificacion(calificacion);
        this.setFechaCalificacion(LocalDate.now());
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaCalificacion() {
        return fechaCalificacion;
    }

    public void setFechaCalificacion(LocalDate fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }
}
