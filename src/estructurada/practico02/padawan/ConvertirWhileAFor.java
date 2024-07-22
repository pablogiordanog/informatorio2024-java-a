package estructurada.practico02.padawan;

/**
 * 2. Convierto lo que me da la gana parte 2: Demuestre cómo convertir un bucle WHILE en un bucle FOR.
 */

public class ConvertirWhileAFor {
    public static void main(String[] args) {
        //Bucle while
        System.out.println("Bucle While");
        int i = 0;
        while(i<=5){
            System.out.println("i = " + i);
            i = i + 1;
        }
        //Bucle for
        System.out.println("Bucle For");
        for(int index=0;index<5;index++){
            System.out.println("index = " + index);
        }
    }
}
