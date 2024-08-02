package poo.practico03.maestro;

public class Notebook extends Producto{

    private int pulgadasPantalla;

    public Notebook(String nombre, String descripcion, double precio, double cantidad,
                       String marca, String nroSerie, int pulgadasPantalla){
        super(nombre,descripcion,precio,cantidad,marca,nroSerie);
        this.setPulgadasPantalla(pulgadasPantalla);
    }

    @Override
    public String toString(){
        return this.getNombre() + "," + this.getDescripcion() + ", Precio: $ " + this.getPrecio() + ", Cantidad:"
                + this.getCantidad() + ", " + this.getMarca() + ", Nro.Serie:" + this.getNroSerie() + ", Pulgada:" + this.getPulgadasPantalla();
    }

    @Override
    public void comprar() {

    }

    @Override
    public void vender() {

    }

    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(int pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }
}
