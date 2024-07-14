package imperativa.practico01.caballero;

import java.util.Scanner;

public class ConversionBitcoinsADolares {
    final static double TASA_FIJA = 50000.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los bitcoins: ");
        double bitcoins = scanner.nextDouble();
        double equivalenteEnDolares = bitcoins * TASA_FIJA;
        System.out.println(bitcoins + " bitcoins equivalen a " + equivalenteEnDolares + " en dolares");
    }
}
