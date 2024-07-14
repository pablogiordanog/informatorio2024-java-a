package imperativa.practico01.inicial;

public class Multiplicacion {
    public static void main(String[] args) {
        float numero1Real = 10.5f; //indico que el valor sea de tipo real
        double numero2Real = 50.52; //no es necesario indicar con d(50.52d), ya que java busca usar tipo de datos
                                    //con mayor presicion.
        double resultadoReal = numero1Real * numero2Real; //uso double porque es de mayor presicion
                                                          //y usa el doble(64 bits) de espacion de memoria que float(32 bits)
        int numero1Int = 25;
        int numero2Int = 9;
        int resultadoInt = numero1Int * numero2Int;

        double suma = resultadoReal + resultadoInt;
        System.out.println("El resultado de la suma es " + suma + " y es de tipo real.");
    }
}
