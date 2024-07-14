package imperativa.practico01.maestro;

/**
 * Cálculo de la fuerza centrípeta:
 * Escribir un programa en Java que calcule la fuerza centrípeta necesaria para mantener un objeto en
 * una trayectoria circular, dados su masa, la velocidad angular y el radio de la trayectoria.
 * Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
 * fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria.
 * Muestre el resultado por pantalla.
 */

public class FuerzaCentrifuga {
    public static void main(String[] args) {
        double masa             = 100.98;
        double velocidadAngular = 10.4;
        double radio            = 20;
        double fuerzaCentrifuga = masa * velocidadAngular * velocidadAngular / radio;
        System.out.println("Fuerza centrífuga es " + fuerzaCentrifuga);
    }
}
