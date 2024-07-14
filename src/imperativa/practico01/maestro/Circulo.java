package imperativa.practico01.maestro;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.PrimitiveIterator;

/**
 * Escribir un programa en Java que calcule el área de un círculo con un radio de 5 unidades.
 * Buscar la fórmula con la que se resuelve.
 */

public class Circulo {
    final static double PI = 3.1416;
    public static void main(String[] args) {
        double radio = 5.0;
        double area = PI * radio * radio;
        System.out.println("Area de círculo es " + area);
    }
}
