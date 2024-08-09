package poo.ejercicios.tarea2;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Institucion institucion = new Institucion();
        int opcion;
        do {
            System.out.println("Ingrese opcion :");
            System.out.println("1. Crear curso");
            System.out.println("2. Registrar estudiante nuevo");
            System.out.println("3. Registrar a un curso a partir de un estudiante existente");
            System.out.println("4. Listar cursos");
            System.out.println("5. Listar cursos y estudiantes");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); //Limpiar salto de linea

            switch (opcion){
                case 1:
                    //Funcionalidad para crear un curso
                    institucion.crearCurso();
                    break;
                case 2:
                    //Funcionalidad registrar estudiante nuevo
                    System.out.println("Ingreso id de curso");
                    String idCurso = scanner.nextLine();
                    institucion.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3:
                    //Funcionalidad Registrar a un curso a partir de un estudiante existente
                    System.out.println("Ingrese el curso");
                    idCurso = scanner.nextLine();
                    System.out.println("Ingrese dni de estudiante");
                    Long dniEstudiante = scanner.nextLong();
                    try {
                        institucion.inscribirEstudianteACurso(UUID.fromString(idCurso), dniEstudiante);
                    }catch(NoSuchElementException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    //Funcionalidad listar curso
                    institucion.listarCursos();
                    break;
                case 5:
                    //Funcionalidad listar cursos y estudiantes
                    institucion.listarEstudiantesYCursos();
                    break;
                case 6:
                    System.out.println("Fin del sistema");
                    break;
                default:
                    System.out.println("Opción de menú invalida.");
            }

        }while(opcion!=6);

        scanner.close();
    }
}
