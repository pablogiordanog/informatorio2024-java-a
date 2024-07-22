package estructurada.practico02.padawan;

/**
 * 1. Convierto lo que me da la gana: Demuestre cómo convertir un bucle WHILE en un DO WHILE.
 */


public class ConviertoWhileADoWhile {
    public static void main(String[] args) {
        //Bucle while
        System.out.println("Bucle While");
        int i = 0;
        while(i<=5){
            System.out.println("i = " + i);
            i = i + 1;
        }

        //Bucle do while
        System.out.println("Bucle Do While");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j = j + 1;
        }while(j<=5);

    }
}
