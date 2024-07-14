package imperativa.practico01.padawan;

public class PromedioEdad {
    public static void main(String[] args) {
        //Juan
        char j1 = 'J';
        char j2 = 'u';
        char j3 = 'a';
        char j4 = 'n';
        int edadJuan = 23;

        //Pedro
        char p1 = 'P';
        char p2 = 'e';
        char p3 = 'd';
        char p4 = 'r';
        char p5 = 'o';
        int edadPedro = 30;

        //sacar promedio
        double promedio = edadJuan + edadPedro / 2;

        System.out.println("" + j1 + j2 + j3 + j4 + " tiene " + edadJuan);
        System.out.println("" + p1 + p2 + p3 + p4 + p5 + " tiene " + edadPedro);
        System.out.println("El promedio de edades es " + promedio);
    }
}
