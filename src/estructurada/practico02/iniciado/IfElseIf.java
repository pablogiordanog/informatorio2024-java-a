package estructurada.practico02.iniciado;

/**
 * 4. De que se trata esto? : Realizar un programa que guarde
 * un número en memoria y determine si es positivo, negativo o cero.
 */

public class IfElseIf {
    public static void main(String[] args) {
        //double numero = 23.4;
        //double numero = 0.0;
        double numero = -0.1;
        if(numero>0.0d){
            System.out.println("El numero " + numero + " es positivo.");
        }else{
            if(numero==0.0d){
                System.out.println("El numero " + numero + " es cero.");
            }else{
                System.out.println("El numero " + numero + " es negativo.");
            }
        }
    }
}
