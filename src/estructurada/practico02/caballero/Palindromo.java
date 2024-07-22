package estructurada.practico02.caballero;

/**
 * 6. Sera Palíndromo?: Dado un arreglo con caracteres (Formando una palabra) indicar si es o no palíndromo.
 */

public class Palindromo {
    public static void main(String[] args) {
        char[] palabra = {'o', 's', 'o'};
        boolean isPalindromo = true;
        for(int i=0;i<palabra.length;i++){
            if(palabra[i] != palabra[palabra.length - i - 1]){
                isPalindromo = false;
                break;
            }
        }
        if (isPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
