package imperativa.practico01.inicial;

public class Acumulador {
    public static void main(String[] args) {
        int numero1 = 10000;
        int numero2 = 9999;

        int resultado = numero1*numero2/1 + numero1*numero2/2 + numero1*numero2/3 + numero1*numero2/4
                      + numero1*numero2/5 + numero1*numero2/6 + numero1*numero2/7 + numero1*numero2/8
                      + numero1*numero2/9 + numero1*numero2/10 + numero1*numero2/11 + numero1*numero2/12
                      + numero1*numero2/13 + numero1*numero2/14 + numero1*numero2/15;
        System.out.println("El resultado es " + resultado);
    }
}
