package poo.practico03.caballero;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {

    private String nombreDiccionario;
    private Map<String, Palabra> palabras;

    public Diccionario(String nombreDiccionario){
        this.setNombreDiccionario(nombreDiccionario);
        this.setPalabras(new HashMap<String, Palabra>());
    }

    /**
     * Agrego palabra a diccionario
     * @param palabra
     */
    public boolean agregarPalabra(Palabra palabra){
        boolean siAgregoPalabra = true;
        if(this.getPalabras().containsKey(palabra.getPalabra())){
            siAgregoPalabra = false;
        }else {
            this.getPalabras().put(palabra.getPalabra(), palabra);
        }
        return siAgregoPalabra;
    }

    /**
     * Retorna la palabra con su definicion
     * @param palabraBuscar
     * @return
     */
    public Palabra buscarPalabra(String palabraBuscar){
        Palabra palabra = null;
        if(getPalabras().containsKey(palabraBuscar)){
            Palabra palabraEncontrada = getPalabras().get(palabraBuscar);
            palabra = new Palabra(palabraEncontrada.getPalabra(), palabraEncontrada.getDefinicion());
        }else{
            palabra = new Palabra("","PALABRA NO ENCONTRADA");
        }
        return palabra;
    }

    public String getNombreDiccionario() {
        return nombreDiccionario;
    }

    public void setNombreDiccionario(String nombreDiccionario) {
        this.nombreDiccionario = nombreDiccionario;
    }

    public Map<String, Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(Map<String, Palabra> palabras) {
        this.palabras = palabras;
    }
}
