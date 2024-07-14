package imperativa.practico01.maestro;

/**
 * Conversión de grados Celsius a grados Fahrenheit :
 * Escribir un programa en Java que convierta una temperatura en grados Celsius a grados Fahrenheit.
 * Buscar la fórmula con la que se resuelve.
 */

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        double temperaturaCelsius = 10.5;

        //Formula para conversion de celsius a fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        System.out.println("La temperatura de " + temperaturaCelsius + " grados celsius " + '\n'
                            + "Equivalen a " + temperaturaFahrenheit + " grados Fahrenheit.");
    }
}
