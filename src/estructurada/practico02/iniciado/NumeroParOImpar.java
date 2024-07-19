package estructurada.practico02.iniciado;

/**
 * 3.Suma de números : Realizar un programa que guarde un número en memoria y determine si es par o impar.
 */

public class NumeroParOImpar {
    public static void main(String[] args) {
        //double numero = 18.0;
        double numero = 18.1;
        //Si el residulo de la division es 0 entonces es par
        if(numero % 2 == 0){
            System.out.println("Numero " + numero + " es par.");
        }else{
            System.out.println("Numero " + numero + " es impar.");
        }
    }
}
