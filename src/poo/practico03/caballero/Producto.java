package poo.practico03.caballero;

import java.util.Objects;

public class Producto {
    private String nombre;
    private double precio;
    private double stock;

    public Producto(String nombre, double precio, double stock){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    @Override
    public String toString(){
        return "Producto:" + this.getNombre() + ", Precio: $ " + this.getPrecio() + ", Stock: " + this.getStock();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(getNombre(), producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}
