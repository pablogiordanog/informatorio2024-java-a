package imperativa.practico01.caballero;

public class Porcentaje {
    public static void main(String[] args) {
        double numeroReal = 100.0;
        int porcentaje = 3;

        double resultado = numeroReal * porcentaje / 100;
        System.out.println("El " + porcentaje + "% de " + numeroReal + " es " + resultado);
    }
}
