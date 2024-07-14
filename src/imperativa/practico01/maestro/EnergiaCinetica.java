package imperativa.practico01.maestro;

/**
 * Cálculo de la energía cinética:
 * Escribir un programa en Java que calcule la energía cinética de un objeto en movimiento, dados su masa y su velocidad.
 * Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa del objeto y v es la velocidad.
 */

public class EnergiaCinetica {
    public static void main(String[] args) {
        double masa = 150.45;
        double velocidad = 85.5;
        double energia = (1.d/2) * masa * velocidad * velocidad;
        System.out.println("Energia Cinética es " + energia);
    }
}
