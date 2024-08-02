package poo.ejercicios.gestionvehiculos;

public class Coche extends Vehiculo{

    private int nroPuertas;

    public Coche(String marca, String modelo, int kilometraje, int nroPuertas){
        super(marca, modelo, kilometraje);
        this.setNroPuertas(nroPuertas);
    }

    @Override
    public String toString(){
        return "Coche de " + super.toString() + ", con " + this.getNroPuertas() + " Ruedas.";
    }

    @Override
    public void mover() {
        System.out.println("El coche se esta moviento, desde metodo en clase Vehiculo");
    }

    @Override
    public void mover2() {
        System.out.println("El coche se esta moviento, desde metodo en interface Habilidad");
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }
}
