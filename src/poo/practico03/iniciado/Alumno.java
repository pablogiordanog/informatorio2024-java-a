package poo.practico03.iniciado;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int edad;

    public Alumno(String nombre, String apellido, int edad){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
    }

    @Override
    public String toString(){
        return this.getNombre() + ", " + this.getApellido() + ", " + this.getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
