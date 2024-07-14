package imperativa.practico01.caballero;

import java.util.Scanner;

public class ConversionDolaresAPesos {
    final static double TASA_FIJA = 20;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los dolares: ");
        double dolares = scanner.nextDouble();
        double equivalenteEnDolares = dolares * TASA_FIJA;
        System.out.println(dolares + " dolares equivalen a " + equivalenteEnDolares + " en pesos");
    }
}
