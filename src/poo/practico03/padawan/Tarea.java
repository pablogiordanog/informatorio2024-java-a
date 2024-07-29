package poo.practico03.padawan;

import java.time.LocalDate;

public class Tarea {

    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;

    public Tarea(String titulo, String descripcion){
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
    }

    @Override
    public String toString(){
        return this.getTitulo() + " " + this.getDescripcion();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
