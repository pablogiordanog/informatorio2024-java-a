package poo.practico03.maestro;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<ProductoElectronico> lista = new ArrayList<ProductoElectronico>();

        Notebook n1 = new Notebook("Notebook Lenovo 15", "Notebook Lenovo para programadores",
                        150000, 1,"Lenovo", "870q3df23", 15);

        lista.add(n1);

        Telefono t1 = new Telefono("Samsung G1", "Telefono samsung", 200000, 1,
        "Samsung", "D87J67", "IMEI:HJN7683M", 373534112);

        lista.add(t1);

        for(ProductoElectronico p:lista){
            System.out.println(p.toString());
        }

    }
}
