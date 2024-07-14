package imperativa.practico01.inicial;

public class SumaDeDosBits {
    public static void main(String[] args) {
        byte numeroByte1 = 10;
        byte numeroByte2 = 10;
        byte resultadoOpcional1 = (byte)(numeroByte1 + numeroByte2);
        int resultadoOpcional2  = numeroByte1 + numeroByte2;

        System.out.println("Suma de 2 numero de tipo byte usando Cast");
        System.out.print("El resultado es " + resultadoOpcional1 + " y es " + (resultadoOpcional1 % 2 == 0? "par" : "impar" ));


        System.out.println("");
        System.out.println("Suma de 2 numero de byte con resultado de tipo int");
        System.out.print("El resultado es " + resultadoOpcional2 + " y es " + (resultadoOpcional2 % 2 == 0? "par" : "impar" ));
    }
}
