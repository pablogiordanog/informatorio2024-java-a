package imperativa.practico01.caballero;
import java.util.Scanner;

public class ConversionEutosADolares {
    final static double TASA_FIJA = 1.20;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los euros: ");
        double euros = scanner.nextDouble();
        double equivalenteEnDolares = euros * TASA_FIJA;
        System.out.println(euros + " euros equivalen a " + equivalenteEnDolares + " en dolares");
    }
}
