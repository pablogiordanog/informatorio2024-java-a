package imperativa.practico01.inicial;

public class SumaDosNumeros {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        int resultado = numero1 + numero2;
        System.out.print("El resultado es " + resultado + " y es " + (resultado / 2 == 0? "par" : "impar" ));
    }
}
