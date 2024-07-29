package poo.practico03.padawan;

import java.util.List;
import java.util.Objects;

public class Contacto {

    private String nombre;
    private long numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombre, long numeroTelefono, String correoElectronico){
        this.setNombre(nombre);
        this.setNumeroTelefono(numeroTelefono);
        this.setCorreoElectronico(correoElectronico);
    }

    @Override
    public String toString(){
        return this.getNombre() + "  Tel.:" + this.getNumeroTelefono() + " e-mail:" + this.getCorreoElectronico();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Contacto c = (Contacto) o;
        boolean isOk = Objects.equals(this.getNombre().trim(), c.getNombre().trim())
                && this.getNumeroTelefono()==c.getNumeroTelefono()
                && Objects.equals(this.getCorreoElectronico().trim(), c.getCorreoElectronico().trim());

        return isOk;
    }

    // Sobrescribir el método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getNumeroTelefono(), this.getCorreoElectronico());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean siEsta(List<Contacto> list){
        boolean siEsta = list.contains(this);
        return siEsta;
    }

    public boolean siIngresar(List<Contacto> list){
        boolean isIngresar = siEsta(list);
        if(!isIngresar){
            list.add(this);
        }
        return isIngresar;
    }

    public void modificarContacto(Contacto c){
        this.setNombre(c.getNombre());
        this.setNumeroTelefono(c.getNumeroTelefono());
        this.setCorreoElectronico(c.getCorreoElectronico());
    }

    public boolean siBorrar(List<Contacto> list){
        boolean isBorrar = list.remove(this);
        return isBorrar;
    }

}
