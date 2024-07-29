package poo.practico03.padawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEjercicio3 {

    static void opciones(){
        System.out.println("Menú de Opciones");
        System.out.println("=================");
        System.out.println("1-Ingresar Nuevo Estudiante");
        System.out.println("2-Listar Promedios");
        System.out.println("0-Terminar");
    }

    static Estudiante ingresarPorTecladoEstudiante(String opcion){
        Scanner scanner = new Scanner(System.in);
        System.out.println(opcion);
        System.out.println("===============");

        System.out.print("Nro. Legajo:");
        int id = scanner.nextInt();

        System.out.print("Nombre:");
        String nombre = scanner.next();

        Estudiante estudiante = new Estudiante(id, nombre);

        return estudiante;
    }

    static List<Calificacion> ingresarCalificaciones(){
        List<Calificacion> calificaciones = new ArrayList<Calificacion>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nuevas Calificaciones");
        System.out.println("=============================");

        String terminar = "N";
        while(!terminar.equals("S")){
            System.out.print("Nueva Calificación[0..10]:");
            double calif = scanner.nextDouble();
            if(calif>=0 && calif<=10){
                Calificacion calificacion = new Calificacion(calif);
                calificaciones.add(calificacion);
                System.out.print("Desea Salir (S/N)?");
                terminar = scanner.next();
            }else {
                System.out.println("Calificación incorrecto, solo se permite desde 0...10");
            }
        }
        return calificaciones;
    }

    static void ingresarEstudiante(List<Estudiante> list){
        Estudiante estudiante = ingresarPorTecladoEstudiante("Nuevo Estudiante");
        if(list.contains(estudiante)){
            System.out.println("ID incorrecto! No se Ingreso Estudiante!");
        }else{
            list.add(estudiante);
            System.out.println("Estudiante " + estudiante.toString() + " Ingresado.");
            List<Calificacion> listCalificaciones = ingresarCalificaciones();
            estudiante.setCalificaciones(listCalificaciones);
        }
    }

    static void listarPromedios(List<Estudiante> listEstudiantes){
        if(listEstudiantes.size()==0){
            System.out.println("No hay datos para listar promedios.");
            return;
        }
        System.out.println("Promedio de Notas de Estudiantes");
        System.out.println("================================");
        for(int i=0;i<listEstudiantes.size();i++){
            Estudiante estudiante = listEstudiantes.get(i);
            System.out.println(estudiante.toString() + ", Promedio : " + estudiante.getPromedio());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudianteList = new ArrayList<Estudiante>();
        int opcion = 1;
        while (opcion!=0){
            opciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:break;
                case 1://Ingresar Estudiante
                    ingresarEstudiante(estudianteList);
                    break;
                case 2://Listar Promedios
                    listarPromedios(estudianteList);
                    break;
                case 3://Borrar

                    break;
                default:break;
            }
        }
        scanner.close();
    }
}
