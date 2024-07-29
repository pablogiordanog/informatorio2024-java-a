package poo.practico03.iniciado;

import poo.practico03.iniciado.diagramas.Curso;

import java.util.*;

public class App {
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4y5();
    }

    /**
     * Metodo para retornar un grupo de alumnos que uso en los ejercicios
     * @return List
     */
    public static List<Alumno> getAlumnos(){
        Alumno alumno1 = new Alumno("Juan","Ramirez", 18);
        Alumno alumno2 = new Alumno("Matias","Perez", 80);
        Alumno alumno3 = new Alumno("Agostina","Godoy", 35);
        Alumno alumno4 = new Alumno("Pedro","Medina", 35);
        Alumno alumno5 = new Alumno("Felipe","Lopez", 35);
        Alumno alumno6 = new Alumno("Veronica","Laurenti", 35);
        Alumno alumno7 = new Alumno("Adrian","Mendez", 35);
        Alumno alumno8 = new Alumno("Emanuel","Cabrera", 35);
        Alumno alumno9 = new Alumno("Ivanna","Renteria", 35);
        Alumno alumno10 = new Alumno("Fabian","Antognaza", 35);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);
        alumnos.add(alumno10);
        return alumnos;
    }

    /**
     * Metodo para ingresar curso
     * @param listCursos se pasa listado todos los cursos para
     *                  controla que el nombre del curso ya este ingresado
     * @return curso
     */
    public static Curso ingresarCurso(Map<String, Curso> listCursos){
        Scanner scanner = new Scanner(System.in);
        Curso curso;
        System.out.println("Ingreso de Datos de CURSO");
        System.out.println("=========================");
        System.out.print("Ingrese nombre:");
        String nombre = scanner.nextLine();
        if(listCursos.containsKey(nombre)){
            curso = listCursos.get(nombre);
            System.out.print("El curso " + nombre + " cue cargado con anterioridad.");
        }else {
            //Nuevo Curso
            System.out.print("Ingrese descripcion de curso:");
            String descripcion = scanner.nextLine();

            System.out.print("Estado S/N:");
            String estado = scanner.nextLine();
            boolean isHabilitado = estado.trim().equals("S");
            curso = new Curso(nombre, isHabilitado, descripcion, new HashMap<>());
            listCursos.put(nombre, curso);
        }
        System.out.println("");
        return curso;
    }

    /**
     * Metodo para listar cursos
     * @param cursos
     */
    public static void listarCursos(Map<String, Curso> cursos){
        for(Curso curso:cursos.values()){
            System.out.println(curso.toString());
            String linea = "";
            for(int l=0;l<curso.toString().length();l++){
                linea = linea + "=";
            }
            System.out.println(linea);
            for(Alumno a:curso.getAlumnos().values()){
                System.out.println(a.toString());
            }
            System.out.println("");
        }
    }

    /**
     * Metodo para ingresar por pantalla datos de alumno
     * @return Alumno
     */
    public static Alumno ingresarAlumno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingreso de Datos de Alumno");
        System.out.println("**************************");
        System.out.print("Ingrese nombre:");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese apellido:");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese edad:");
        int edad = scanner.nextInt();


        Alumno alumno = new Alumno(nombre, apellido, edad);
        return alumno;
    }

    public static void ejercicio1(){
        List<Alumno> alumnos = getAlumnos();
        for(Alumno a:alumnos){
            System.out.println(a.toString());
        }
    }

    public static void ejercicio2(){
        List<Alumno> alumnos = getAlumnos();

        //Para Curso 1
        Map<String, Alumno> alumnosCurso1 = new TreeMap<String, Alumno>();
        for(int i=0;i<5;i++){
            Alumno a = alumnos.get(i);
            alumnosCurso1.put(a.toString(), a);
        }
        Curso curso1 = new Curso("Java", true,"Curso de Programación Java", alumnosCurso1);
        //Fin de carga de Curso 1


        //Para Curso 2
        Map<String, Alumno> alumnosCurso2 = new TreeMap<String, Alumno>();
        for(int i=5;i<alumnos.size();i++){
            Alumno a = alumnos.get(i);
            alumnosCurso2.put(a.toString(), a);
        }
        Curso curso2 = new Curso("Python", true,"Curso de Programación Python", alumnosCurso2);
        //Fin de carga de Curso 2


        //Para Curso 3
        Map<String, Alumno> alumnosCurso3 = new TreeMap<String, Alumno>();
        alumnosCurso3.put(alumnos.get(0).toString(), alumnos.get(0));
        alumnosCurso3.put(alumnos.get(9).toString(), alumnos.get(9));
        Curso curso3 = new Curso("Diseño UX/UI", false,"Curso de Diseño UX/UI", alumnosCurso3);
        //Fin de carga de Curso 3

        //Agrego los cursos a un array
        Map<String, Curso> cursos = new TreeMap<>();
        cursos.put(curso1.toString(),curso1);
        cursos.put(curso2.toString(),curso2);
        cursos.put(curso3.toString(),curso3);
        //Impresion de informacion de cursor
        listarCursos(cursos);
    }

    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        String terminar = "N";
        List<Alumno> alumnos = new ArrayList<Alumno>();
        while (!terminar.equals("S")){
            Alumno alumno = ingresarAlumno();
            alumnos.add(alumno);
            System.out.println("Desea Terminar? S/N");
            terminar = scanner.next();
        }
        for(int i=0;i<alumnos.size();i++){
            System.out.println(alumnos.get(i).toString());
        }
    }

    public static void ejercicio4y5(){
        Scanner scanner = new Scanner(System.in);
        String terminar = "N";
        Map<String,Curso> cursos = new HashMap<String, Curso>();
        while (!terminar.equals("S")){
            Curso curso = ingresarCurso(cursos);
            String terminarCargaAlumnos = "N";
            while(!terminarCargaAlumnos.equals("S")){
                Alumno alumno = ingresarAlumno();
                curso.getAlumnos().put(alumno.toString(), alumno);
                System.out.println("Desea Terminar Cargar Alumnos en curso " + curso.getNombre() + "? S/N");
                terminarCargaAlumnos = scanner.next();
            }
            System.out.println("Desea Terminar Cargar Cursos? S/N");
            terminar = scanner.next();
        }
        listarCursos(cursos);
        scanner.close();
    }
}
