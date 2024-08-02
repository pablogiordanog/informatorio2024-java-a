package poo.practico03.maestro;

public class Computadora extends Producto {

    public Computadora(String nombre, String descripcion, double precio, double cantidad,
                    String marca, String nroSerie){
        super(nombre,descripcion,precio,cantidad,marca,nroSerie);

    }

    @Override
    public String toString(){
        return this.getNombre() + "," + this.getDescripcion() + ", Precio: $ " + this.getPrecio() + ", Cantidad:"
                + this.getCantidad() + ", " + this.getMarca() + ", Nro.Serie:" + this.getNroSerie() ;
    }

    @Override
    public void comprar() {

    }

    @Override
    public void vender() {

    }
}
