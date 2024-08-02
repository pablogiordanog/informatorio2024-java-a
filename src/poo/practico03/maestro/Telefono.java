package poo.practico03.maestro;

public class Telefono extends Producto{

    private String imei;
    private long nroTelefono;

    public Telefono(String nombre, String descripcion, double precio, double cantidad,
                    String marca, String nroSerie, String imei, long nroTelefono){
        super(nombre,descripcion,precio,cantidad,marca,nroSerie);
        this.setImei(imei);
        this.setNroTelefono(nroTelefono);
    }

    @Override
    public String toString(){
        return this.getNombre() + "," + this.getDescripcion() + ", Precio: $ " + this.getPrecio() + ", Cantidad:"
                + this.getCantidad() + ", " + this.getMarca() + ", Nro.Serie:" + this.getNroSerie() + ", IMEI:"
                + this.getImei() + ", Nro.Tel.:" + this.getNroTelefono();
    }

    @Override
    public void comprar() {

    }

    @Override
    public void vender() {

    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public long getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(long nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
}
