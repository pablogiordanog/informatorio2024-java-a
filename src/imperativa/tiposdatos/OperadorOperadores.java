package imperativa.tiposdatos;

public class OperadorOperadores {
    public static void main(String[] args) {
        int resultado = 5 + 3 * 2;
        int resultado2 = 20/2 * 2 + 3;

        //Operador ternario
        int resultado3 = (resultado2>resultado)?1:0;
        boolean isResult = (resultado2>resultado)?true:false;

        int value = 5;
        System.out.println(value++); //Asigna luego incrementa
        System.out.println(++value); //Incrementa luego asigna
        System.out.println(--value); //Decrementa value luego asigna

    }
}
