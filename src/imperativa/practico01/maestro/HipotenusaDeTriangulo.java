package imperativa.practico01.maestro;

/**
 * Cálculo de la hipotenusa de un triángulo:
 * Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
 * dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la hipotenusa,
 * a y b son los catetos.
 */

public class HipotenusaDeTriangulo {
    public static void main(String[] args) {
        double catetoA = 10.8;
        double catetoB = 8.10;

        double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
        System.out.println("La hipotenusa es " + hipotenusa);
    }
}
