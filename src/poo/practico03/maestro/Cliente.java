package poo.practico03.maestro;

public class Cliente {
    private String nombre;
    private String domicilio;

    public Cliente(String nombre, String domicilio){
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
