package imperativa.practico01.padawan;

public class ConversionKilogramos {
    static final double EQUIVALENCIA_LIBRAS_A_KILOS = 0.453592;
    public static void main(String[] args) {
        double libras = 180.872;
        double librasEnKilos = libras * EQUIVALENCIA_LIBRAS_A_KILOS;
        System.out.println("El equivalente de " + libras + " libras en Kilos es de " + librasEnKilos);
    }
}
