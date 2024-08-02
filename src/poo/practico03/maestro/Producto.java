package poo.practico03.maestro;

abstract public class Producto implements ProductoElectronico{
    private String nombre;
    private String descripcion;
    private double precio;
    private double cantidad;
    private String marca;
    private String nroSerie;

    public Producto(String nombre, String descripcion, double precio, double cantidad,
                    String marca, String nroSerie){

        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setCantidad(cantidad);
        this.setMarca(marca);
        this.setNroSerie(nroSerie);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }
}
