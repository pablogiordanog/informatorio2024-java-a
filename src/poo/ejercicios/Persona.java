package poo.ejercicios;

import java.time.LocalDate;

public class Persona {

    private Long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private boolean licencia;
    private Vehiculo vehiculo;

    public Persona(){}
    public Persona(Long dni, String nombre, boolean licencia){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setLicencia(licencia);
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
