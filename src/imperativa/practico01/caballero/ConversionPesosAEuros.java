package imperativa.practico01.caballero;

import java.util.Scanner;

public class ConversionPesosAEuros {
    final static double TASA_FIJA = 20.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los pesos: ");
        double pesos = scanner.nextDouble();
        double equivalenteEnPesos = pesos / TASA_FIJA;
        System.out.println(pesos + " pesos equivalen a " + equivalenteEnPesos + " en euros");
    }
}
