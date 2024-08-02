package poo.ejercicios.gestionvehiculos;

import poo.practico03.caballero.Producto;

import java.util.Objects;

abstract public class Vehiculo implements Habilidad{
    private String marca;
    private String modelo;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int kilometraje){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setKilometraje(kilometraje);
    }

    abstract public void mover();

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(this.getMarca(), vehiculo.getMarca())
                && Objects.equals(this.getModelo(), vehiculo.getModelo())
                && this.getKilometraje()==vehiculo.getKilometraje();
    }

    @Override
    public String toString(){
        return "Marca:" + this.getMarca() + ", Modelo:" + this.getModelo() + ", Kilometraje:" + this.getKilometraje();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
