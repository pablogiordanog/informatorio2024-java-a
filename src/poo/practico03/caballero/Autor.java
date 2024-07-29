package poo.practico03.caballero;

import java.util.Objects;

public class Autor {
    private String nombre;

    public Autor(String nombre){
        this.setNombre(nombre);
    }

    @Override
    public String toString(){
        return "Autor:" + this.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(getNombre(), autor.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
