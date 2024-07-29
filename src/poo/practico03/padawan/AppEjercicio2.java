package poo.practico03.padawan;

import java.util.*;

public class AppEjercicio2 {
    public static void main(String[] args) {
        ejercicio2();
    }

    public static List<Contacto> getListContactos(){
        List<Contacto> contactos = new LinkedList<>();
        Contacto contacto1 = new Contacto("Pablo Giordano", 4l, "pablo@gmail.com");
        Contacto contacto2 = new Contacto("Ivanna Navarro", 1233123l, "ivanna@yahoo.com");
        Contacto contacto3 = new Contacto("Loli Latin", 89833123l, "loli@hotmail.com");
        Contacto contacto4 = new Contacto("Danilo Gonzales", 97323123l, "danilo@gmail.com");
        Contacto contacto5 = new Contacto("Alverto Boitela", 22323123l, "alverto@yahoo.com.ar");

        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);
        contactos.add(contacto4);
        contactos.add(contacto5);

        return contactos;
    }

    static void opciones(){
        System.out.println("Menú de Opciones");
        System.out.println("================");
        System.out.println("1-Listar");
        System.out.println("2-Ingresar Contacto");
        System.out.println("3-Borrar Contacto");
        System.out.println("4-Modificar Contacto");
        System.out.println("5-Buscar Contacto");
        System.out.println("0-Terminar");
    }

    static void listarContactos(List<Contacto> lista){
        System.out.println("Lista de Contactos");
        System.out.println("==================");
        for(int i=0;i<lista.size();i++){
            Contacto contacto = lista.get(i);
            System.out.println("Index:" + i + ")" + contacto.toString());
        }
    }

    static Contacto ingresarPorTecladoContacto(String opcion){
        Scanner scanner = new Scanner(System.in);
        System.out.println(opcion);
        System.out.println("===============");

        System.out.print("Nombre:");
        String nombre = scanner.nextLine();

        System.out.print("Tel.:");
        long telefono = scanner.nextLong();

        System.out.print("e-mail:");
        String email = scanner.next();

        Contacto contacto = new Contacto(nombre, telefono, email.toLowerCase());
        return contacto;
    }

    static void agregarContacto(List<Contacto> list){
        Contacto c = ingresarPorTecladoContacto("Ingresar Contacto");
        boolean siIngreso = c.siIngresar(list);
        if(siIngreso){
            System.out.println("No puede ingresar nuevamente el contacto.");
        }else{
            System.out.println("Contacto ingresado.");
        }
    }

    static void borrarTarea(List<Contacto> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Borrar Contacto");
        System.out.println("===============");
        System.out.print("Ingrese número de index :");
        int index = scanner.nextInt();
        Contacto c = null;
        boolean isBorrar = false;
        if(index < list.size()){
            c = list.get(index);
            isBorrar = c.siBorrar(list);
        }else{
            System.out.println("Valor de index incorrecto!");
            return;
        }
        if(isBorrar){
            System.out.println("Contacto " + c.toString() + " Borrado con éxito.");
        }else{
            System.out.println("NO se borró la tarea.");
        }
    }

    static void editarContacto(List<Contacto> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar Contacto");
        System.out.println("===============");
        System.out.print("Ingrese número de index :");
        int index = scanner.nextInt();
        Contacto c = null;
        boolean isEditar = false;
        if(index < list.size()){
            c = list.get(index);
            isEditar = true;
        }else{
            System.out.println("Valor de index incorrecto!");
            return;
        }
        if(isEditar){
            Contacto cEdit = ingresarPorTecladoContacto("Modificar Contacto");
            c.modificarContacto(cEdit);
            System.out.println("Contacto actualizado.");
        }else{
            System.out.println("NO el contacto no existe.");
        }
    }

    static void buscarContacto(List<Contacto> list){
        Contacto c = ingresarPorTecladoContacto("Buscar Contacto");
        boolean siEsta = c.siEsta(list);
        if(siEsta){
            System.out.println("Contacto Encontrado");
            System.out.println("===================");
            System.out.println(c.toString());
        }else{
            System.out.println("Contacto No Encontrado");
        }
    }

    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        List<Contacto> contactosList = new LinkedList<>(getListContactos());
        int opcion = 1; //1=Listar tareas
        while (opcion!=0){
            opciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:break;
                case 1://Listar
                    listarContactos(contactosList);
                    break;
                case 2://Ingresar
                    agregarContacto(contactosList);
                    break;
                case 3://Borrar
                    borrarTarea(contactosList);
                    break;
                case 4://Editar
                    editarContacto(contactosList);
                    break;
                case 5://Buscar
                    buscarContacto(contactosList);
                    break;
                default:break;
            }
        }
        scanner.close();
    }
}
