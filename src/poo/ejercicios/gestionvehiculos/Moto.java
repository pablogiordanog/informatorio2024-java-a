package poo.ejercicios.gestionvehiculos;

public class Moto extends Vehiculo{

    public Moto(String marca, String modelo, int kilometraje){
        super(marca, modelo, kilometraje);
    }

    @Override
    public String toString(){
        return "Moto de " + super.toString();
    }

    @Override
    public void mover() {
        System.out.println("La moto se esta moviento, desde metodo en clase Vehiculo");
    }

    @Override
    public void mover2() {
        System.out.println("La moto se esta moviento, desde metodo en interface Habilidad");
    }
}
