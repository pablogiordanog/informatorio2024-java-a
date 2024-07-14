package imperativa.practico01.maestro;

/**
 * Cálculo de la velocidad final:
 * Escribir un programa en Java que calcule la velocidad final de un objeto en caída libre,
 * dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido.
 * Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i es la velocidad inicial,
 * g es la aceleración de la gravedad y t es el tiempo transcurrido.
 */

public class VelocidadFinal {
    public static void main(String[] args) {
        double velocidadInicial = 10.9;
        double aceleracion      = 85.19;
        double tiempo           = 10.87;
        double velocidadFinal   = velocidadInicial + aceleracion * tiempo;
        System.out.println("Velocidad final es " + velocidadFinal);
    }
}
