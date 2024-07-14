package imperativa.practico01.inicial;

public class Divisibilidad {
    public static void main(String[] args) {
        int numero1 = 12;
        int numero2 = 6;
        int suma    = numero1 + numero2;
        int restoDeDivision = numero1 % numero2;
        int division = numero1 / numero2;
        System.out.println("El primer número " + numero1 + (restoDeDivision == 0 ? " es divisible" : "  no es divisible") + " y el resultado es " + division);
    }
}
