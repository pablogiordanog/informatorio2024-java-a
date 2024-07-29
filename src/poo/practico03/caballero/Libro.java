package poo.practico03.caballero;

public class Libro {
    private String titulo;
    private Autor autor;
    private int disponible;

    public Libro(String titulo, Autor autor, int disponible){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setDisponible(disponible);
    }

    @Override
    public String toString(){
        return "Libro:" + this.getTitulo() + ", Autor:" + this.getAutor() + ", Cant. Disponible: " + this.getDisponible() ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
}
