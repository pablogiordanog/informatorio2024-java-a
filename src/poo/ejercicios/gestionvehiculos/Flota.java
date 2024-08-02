package poo.ejercicios.gestionvehiculos;

import java.util.List;

public class Flota {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Flota(String nombre, List<Vehiculo> vehiculos){
        this.setNombre(nombre);
        this.setVehiculos(vehiculos);
    }

    public boolean agregarVehiculo(Vehiculo vehiculo){
        boolean siAgregdoVehiculo = !getVehiculos().contains(vehiculo);
        if(siAgregdoVehiculo){
            getVehiculos().add(vehiculo);
        }
        return siAgregdoVehiculo;
    }

    public boolean eliminarVehiculo(Vehiculo vehiculo){
        boolean siEliminoVehiculo = getVehiculos().remove(vehiculo);
        return siEliminoVehiculo;
    }

    public void listarVehiculos(){
        System.out.println(this.toString());
        System.out.println("======================");
        for(Vehiculo vehiculo:getVehiculos()){
            System.out.println(vehiculo.toString());
            System.out.println("--------------------------------");
            vehiculo.mover();
            vehiculo.mover2();
            System.out.println("");
        }
    }


    @Override
    public String toString(){
        return "Flota :" + this.getNombre() + " con " + this.getVehiculos().size() + " Vehiculos";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
