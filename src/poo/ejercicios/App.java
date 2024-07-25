package poo.ejercicios;

public class App {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ford", 4, true, true, "220 Km", "100 Km");
        Persona persona = new Persona(27439097L, "Giordano Pablo", true);
        persona.setVehiculo(vehiculo);

        System.out.println("El nombre de la persona es " + persona.getNombre() + '\n'
                         + "Su DNI:" + persona.getDni() + '\n'
                         + (persona.isLicencia()?"Tiene":"No Tiene") + " Licencia de Conducir" + '\n'
                         + "El vehiculo que posee es de marca:" + persona.getVehiculo().getMarca() + '\n'
                         + "De " + persona.getVehiculo().getCantidadDeRuedas() + " Ruedas" + '\n'
                         + "Km Mínimo es de " + persona.getVehiculo().getKmMinimo() + " y de Máximo " + persona.getVehiculo().getKmMaximo() + ".");
    }
}
