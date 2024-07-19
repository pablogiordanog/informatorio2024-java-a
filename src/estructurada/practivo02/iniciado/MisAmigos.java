package estructurada.practivo02.iniciado;

/**
 * Mis amigos : Guarde en variables el nombre de N cantidad de amigos,
 * itere sobre esa cantidad mostrando el nombre de cada amigo.
 */

public class MisAmigos {
    public static void main(String[] args) {
        String[] amigos = new String[3];
        amigos[0] = "Juan";
        amigos[1] = "Pedro";
        amigos[2] = "Alberto";
        System.out.println("Mis Amigos");
        System.out.println("----------");
        for(int i=0;i<amigos.length;i++){
            System.out.println(amigos[i]);
        }
        System.out.println("----------");
        System.out.println("Fin de Lista");
    }
}
