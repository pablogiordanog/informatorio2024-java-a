package poo.practico03.caballero;

public class Palabra {
    private String palabra;
    private String definicion;

    public Palabra(String palabra, String definicion){
        this.setPalabra(palabra);
        this.setDefinicion(definicion);
    }

    @Override
    public String toString(){
        return this.getPalabra() + ":" + this.getDefinicion();
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
}
