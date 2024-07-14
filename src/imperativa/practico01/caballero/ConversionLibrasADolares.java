package imperativa.practico01.caballero;

import java.util.Scanner;

public class ConversionLibrasADolares {
    final static double TASA_FIJA = 1.40;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las libras esterlinas: ");
        double libras = scanner.nextDouble();
        double equivalenteEnDolares = libras * TASA_FIJA;
        System.out.println(libras + " libras esterlinas equivalen a " + equivalenteEnDolares + " en dolares");
    }
}
