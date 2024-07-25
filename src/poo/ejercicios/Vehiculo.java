package poo.ejercicios;

public class Vehiculo {
    private String marca;
    private int cantidadDeRuedas;
    protected boolean competencia;
    protected boolean alarma;
    private String kmMaximo;
    private String kmMinimo;

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMinimo, String kmMaximo){
        this.setMarca(marca);
        this.setCantidadDeRuedas(cantidadDeRuedas);
        this.setCompetencia(competencia);
        this.setKmMinimo(kmMinimo);
        this.setKmMaximo(kmMaximo);
    }

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, boolean alarma, String kmMaximo, String kmMinimo){
        this.setMarca(marca);
        this.setCantidadDeRuedas(cantidadDeRuedas);
        this.setCompetencia(competencia);
        this.setAlarma(alarma);
        this.setKmMaximo(kmMaximo);
        this.setKmMinimo(kmMinimo);
    }

    public String mostrarPorPantallaMarca(){
        return this.getMarca();
    }

    public void arrancarVehiculo(){
        System.out.println("Arrancando Vehiculo...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }
}
