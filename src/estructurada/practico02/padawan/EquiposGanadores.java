package estructurada.practico02.padawan;

/**
 * 11. Los equipos ganadores : Guarde en variables el nombre de 2 equipos de fútbol,
 * luego en otras 2 variables el nombre de los entrenadores y luego guarde
 * el nombre de los jugadores en distintas variables.
 * Luego muestre un encabezado con el nombre de cada equipo
 * y por cada equipo muestre los nombres de los jugadores.
 */

public class EquiposGanadores {
    public static void main(String[] args) {
        String equipo1 = "Boca Junior";
        String entrenador1 = "Jorge Almirón";
        String[] jugadoresEquipo1 = {
                "Sergio Romero",
                "Luis Advíncula",
                "Frank Fabra",
                "Marcos Rojo",
                "Nicolás Figal",
                "Guillermo Fernández",
                "Alan Varela",
                "Juan Ramírez",
                "Óscar Romero",
                "Darío Benedetto",
                "Sebastián Villa"
        };

        String equipo2 = "River Plate";
        String entrenador2 = "Martín Demichelis";
        String[] jugadoresEquipo2 = {
                "Franco Armani",
                "Robert Rojas",
                "Paulo Díaz",
                "Milton Casco",
                "Enzo Pérez",
                "Nicolás De La Cruz",
                "Agustín Palavecino",
                "Santiago Simón",
                "Esequiel Barco",
                "Lucas Beltrán",
                "Miguel Borja"
        };

        System.out.println("Equipo 1: " + equipo1);
        System.out.println("Lista de Jugadores de Equipo: " + equipo1);
        System.out.println("=============================================");
        for(int e1=0;e1<jugadoresEquipo1.length;e1++){
            System.out.println((e1+1) + ")" + jugadoresEquipo1[e1]);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Equipo 2: " + equipo2);
        System.out.println("Lista de Jugadores de Equipo: " + equipo2);
        System.out.println("=============================================");
        for(int e2=0;e2<jugadoresEquipo2.length;e2++){
            System.out.println((e2+1) + ")" + jugadoresEquipo2[e2]);
        }
    }

}
