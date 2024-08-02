package poo.ejercicios.gestionvehiculos;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Coche c1 = new Coche("Ford", "Focus", 270000, 5);
        Coche c2 = new Coche("Ford", "Sedán", 170000, 4);
        Coche c3 = new Coche("Ford", "EcoSport 2013", 6000000, 5);

        Moto m1 = new Moto("Honda", "Tornado", 600212);
        Moto m2 = new Moto("Zanella", "Interceptor 650", 800212);
        Moto m3 = new Moto("Yamaha", "Moto1Pro", 212);

        Flota flota = new Flota("Nombre de la Flota", new LinkedList<Vehiculo>());
        System.out.println("Agregando Vehiculos");
        System.out.println("===================");
        if(flota.agregarVehiculo(c1)){
            System.out.println(c1.toString() + " Agregado.");
        }else{
            System.out.println(c1.toString() + " Fue agregado con anterioridad.");
        }
        if(flota.agregarVehiculo(c2)){
            System.out.println(c2.toString() + " Agregado.");
        }else{
            System.out.println(c2.toString() + " Fue agregado con anterioridad.");
        }
        if(flota.agregarVehiculo(c3)){
            System.out.println(c3.toString() + " Agregado.");
        }else{
            System.out.println(c3.toString() + " Fue agregado con anterioridad.");
        }
        if(flota.agregarVehiculo(m1)){
            System.out.println(m1.toString() + " Agregado.");
        }else{
            System.out.println(m1.toString() + " Fue agregado con anterioridad.");
        }
        if(flota.agregarVehiculo(m2)){
            System.out.println(m2.toString() + " Agregado.");
        }else{
            System.out.println(m2.toString() + " Fue agregado con anterioridad.");
        }
        if(flota.agregarVehiculo(m3)){
            System.out.println(m3.toString() + " Agregado.");
        }else{
            System.out.println(m3.toString() + " Fue agregado con anterioridad.");
        }
        //pruebo si ya esta, borro el objeto y lo cargo de nuevo
        if(flota.agregarVehiculo(c2)){
            System.out.println(c2.toString() + " Agregado.");
        }else{
            System.out.println(c2.toString() + " Fue agregado con anterioridad.");
            //Lo borro y lo agrego
            if(flota.eliminarVehiculo(c2)){
                System.out.println(c2.toString() + " eliminado.");
                if(flota.agregarVehiculo(c2)){
                    System.out.println(c2.toString() + " Agregado nuevamente.");
                }else{
                    System.out.println(c2.toString() + " NO se Agrego nuevamente.");
                }
            }else{
                System.out.println(c2.toString() + " NO se pudo eliminar.");
            }
        }

        System.out.println("Listando Vehiculos");
        System.out.println("==================");
        flota.listarVehiculos();

    }
}
