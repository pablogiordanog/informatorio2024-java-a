package imperativa.practico01.maestro;

/**
 * Cálculo de la media aritmética:
 * Escribir un programa en Java que calcule la media aritmética de un conjunto de números.
 * Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ...,
 * nk son los números y k es el número total de elementos. Utilicen variables y constantes según corresponda.
 */

public class MediaAritmetica {
    public static void main(String[] args) {
        double n1 = 100.45;
        double n2 = 80.45;
        double n3 = 10.45;
        double n4 = 12.45;
        double n5 = 14.45;

        double media = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("La media es " + media);
    }
}
