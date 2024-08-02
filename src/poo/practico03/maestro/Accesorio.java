package poo.practico03.maestro;

public class Accesorio extends Producto{

    private int nroPiezas;

    public Accesorio(String nombre, String descripcion, double precio, double cantidad,
                     String marca, String nroSerie, int nroPiezas){
        super(nombre,descripcion,precio,cantidad,marca,nroSerie);
        this.setNroPiezas(nroPiezas);
    }

    @Override
    public String toString(){
        return this.getNombre() + "," + this.getDescripcion() + ", Precio: $ " + this.getPrecio() + ", Cantidad:"
                + this.getCantidad() + ", " + this.getMarca() + ", Nro.Serie:" + this.getNroSerie() + ", Nro. Piezas:" + this.getNroPiezas();
    }

    @Override
    public void comprar() {

    }

    @Override
    public void vender() {

    }

    public int getNroPiezas() {
        return nroPiezas;
    }

    public void setNroPiezas(int nroPiezas) {
        this.nroPiezas = nroPiezas;
    }
}
