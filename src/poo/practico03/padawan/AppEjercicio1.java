package poo.practico03.padawan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEjercicio1 {
    public static void main(String[] args) {
        ejercicio1();
    }

    public static List<Tarea> getListaTareas(){
        Tarea t1 = new Tarea("Tarea 1", "Agregar opción de listado de ariculos");
        Tarea t2 = new Tarea("Tarea 2", "Migrar archivos de png a base de datos");
        Tarea t3 = new Tarea("Tarea 3", "Borrar archivos temporales de mi pc");
        Tarea t4 = new Tarea("Tarea 4", "Crear una cuenta de correo electrónico");
        Tarea t5 = new Tarea("Tarea 5", "Enviar correo a pablogiordanog@gmail.com");

        List<Tarea> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        lista.add(t5);

        return lista;
    }

    static void opciones(){
        System.out.println("Menú de Opciones");
        System.out.println("================");
        System.out.println("1-Listar");
        System.out.println("2-Ingresar Tarea");
        System.out.println("3-Borrar Tarea");
        System.out.println("4-Modificar Tarea");
        System.out.println("0-Terminar");
    }

    static void listarTareas(List<Tarea> lista){
        System.out.println("Lista de Tareas");
        System.out.println("===============");
        for(int i=0;i<lista.size();i++){
            Tarea t = lista.get(i);
            System.out.println("Index:" + i + ")" +t.toString());
        }
    }

    static Tarea ingresarPorTecladoTarea(String opcion){
        Scanner scannerIngresar = new Scanner(System.in);
        System.out.println(opcion);
        System.out.println("===============");
        System.out.print("Titulo:");
        String titulo = scannerIngresar.nextLine();
        System.out.print("Descripción:");
        String descripcion = scannerIngresar.nextLine();
        Tarea t = new Tarea(titulo, descripcion);
        return t;
    }

    static void agregarTarea(List<Tarea> lista){
        Tarea t = ingresarPorTecladoTarea("Ingresar Tarea");
        lista.add(t);
    }

    static void borrarTarea(List<Tarea> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Borrar Tarea");
        System.out.println("============");
        System.out.print("Ingrese número de index :");
        int index = scanner.nextInt();
        Tarea t = null;
        if(index < lista.size()){
            t = lista.get(index);
        }else{
            System.out.println("Valor de index incorrecto!");
            return;
        }
        boolean isBorrar = lista.remove(t);
        if(isBorrar){
            System.out.println("Tarea " + t.getTitulo() + " Borrada con éxito.");
        }else{
            System.out.println("Tarea " + t.getTitulo() + " No Encontrada.");
            System.out.println("NO se borró la tarea.");
        }
    }

    static void editarTarea(List<Tarea> lista){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar Tarea");
        System.out.println("============");
        System.out.print("Ingrese número de index :");
        int index = scanner.nextInt();
        Tarea t = null;
        if(index < lista.size()){
            t = lista.get(index);
            Tarea tNueva = ingresarPorTecladoTarea("Editando " + t.getTitulo());
            t.setTitulo(tNueva.getTitulo());
            t.setDescripcion(tNueva.getDescripcion());
            System.out.println("Tarea Modificada");
        }else{
            System.out.println("Valor de index incorrecto!");
            return;
        }
    }

    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        List<Tarea> tareasList = new ArrayList<>(getListaTareas());
        int opcion = 1; //1=Listar tareas
        while (opcion!=0){
            opciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:break;
                case 1://Listar
                    listarTareas(tareasList);
                    break;
                case 2://Ingresar
                    agregarTarea(tareasList);
                    break;
                case 3://Borrar
                    borrarTarea(tareasList);
                    break;
                case 4://Editar
                    editarTarea(tareasList);
                    break;
                default:break;
            }
        }
    }
}
