package poo.practico03.caballero;

import java.util.*;

public class AppEjercicio2 {

    static void opciones(){
        System.out.println("Menú de Opciones");
        System.out.println("=================");
        System.out.println("1-Ingresar Producto");
        System.out.println("2-Actualizar Producto");
        System.out.println("3-Consultar Producto");
        System.out.println("0-Terminar");
    }

    static Map<String, Palabra> ingresarPalabras(){
        Map<String, Palabra> palabras = new HashMap<String, Palabra>();
        System.out.println("Ingrese Nuevas Palabras");
        System.out.println("=======================");

        String terminar = "N";
        while(!terminar.equals("S")){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Palabra:");
            String palabra = scanner.next();

            System.out.print("Definición:");
            String definicion = scanner.next();

            if(palabras.containsKey(palabra)){
                System.out.println("Se ingreso con anterioridad la palabra:" + palabra + "!");
                System.out.println("Palabra no ingresada!");
            }else{
                Palabra palabraItem = new Palabra(palabra,definicion);
                palabras.put(palabra, palabraItem);

                System.out.println("Desea Salir (S/N)?");
                terminar = scanner.next();
            }
        }
        return palabras;
    }

    static boolean ingresarPorTecladoProducto(Map<String, Producto> productsList){
        boolean siIngresar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar Producto");
        System.out.println("=================");

        System.out.print("Producto:");
        String nombre = scanner.nextLine();

        System.out.print("Precio:");
        double precio = scanner.nextDouble();

        System.out.print("Stock:");
        double stock = scanner.nextDouble();

        if(productsList.containsKey(nombre)){
             siIngresar = false;
        }else{
            Producto producto = new Producto(nombre, precio, stock);
            productsList.put(nombre, producto);
            System.out.println("Producto ingresado!");
        }

        return siIngresar;
    }

    static Producto consultarProducto(String nombre, Map<String, Producto> productsList){
        Producto prodBuscar = null;
        if(productsList.containsKey(nombre)){
            prodBuscar = productsList.get(nombre);
        }else{
            prodBuscar = new Producto("",0,0);
        }
        return prodBuscar;
    }

    static boolean actualizarPorTecladoProducto(Map<String, Producto> productsList){
        boolean siActualizar = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buscar Producto");
        System.out.println("===============");

        System.out.print("Producto:");
        String nombre = scanner.nextLine();

        Producto prodEditar = consultarProducto(nombre.trim(), productsList);
        if(prodEditar.getNombre().trim().isBlank()){
            System.out.println("Producto no encontrado!");
            siActualizar = false;
        }else {
            System.out.println("Editar Producto");
            System.out.println("===============");
            System.out.println("Precio: $" + prodEditar.getPrecio());
            System.out.println("Stock :  " + prodEditar.getStock());

            System.out.print("Nueva Descripción:");
            String nombreNuevo = scanner.nextLine();

            System.out.print("Nuevo Precio:");
            double precio = scanner.nextDouble();

            System.out.print("Nuevo Stock:");
            double stock = scanner.nextDouble();

            prodEditar.setNombre(nombreNuevo);
            prodEditar.setPrecio(precio);
            prodEditar.setStock(stock);
            System.out.print("Producto actualizado!");
        }
        return siActualizar;
    }

    static void consultarProductos(Map<String, Producto> productsList){
        System.out.println("Listar Productos");
        System.out.println("================");
        for(Producto producto:productsList.values()){
            System.out.println(producto.toString());
        }
        System.out.println("Fin de Productos");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Producto> productosList = new HashMap<String, Producto>();
        int opcion = 1;
        while (opcion!=0){
            opciones();
            opcion = scanner.nextInt();
            switch (opcion){
                case 0:break;
                case 1://Ingresar Producto
                    ingresarPorTecladoProducto(productosList);
                    break;
                case 2://Buscar palabra
                    actualizarPorTecladoProducto(productosList);
                    break;
                case 3://Listar Productos
                    consultarProductos(productosList);
                    break;
                default:break;
            }
        }
        scanner.close();
    }
}
