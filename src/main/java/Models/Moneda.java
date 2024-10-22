package Models;

public class Moneda extends ElementoColeccionable {
    // [1] Atributos de la clase Moneda
    private String composicion; // Aleación de la moneda
    private double peso; // Peso de la moneda en gramos
    private double diametro; // Diámetro de la moneda en milímetros
    private double grosor; // Grosor de la moneda en milímetros
    private EstadoConservacion estadoConservacion; // Estado de conservación de la moneda

    // [2] Constructor de la clase Moneda
    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacion estadoConservacion) throws IllegalArgumentException {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    // [3] Getters y Setters
    public String getComposicion() {return composicion;}
    public double getPeso() {return peso;}
    public double getDiametro() {return diametro;}
    public double getGrosor() {return grosor;}
    public EstadoConservacion getEstadoConservacion() {return estadoConservacion;}

    public void setComposicion(String composicion) {this.composicion = composicion;}
    public void setPeso(double peso) {this.peso = peso;}
    public void setDiametro(double diametro) {this.diametro = diametro;}
    public void setGrosor(double grosor) {this.grosor = grosor;}
    public void setEstadoConservacion(EstadoConservacion estadoConservacion) {this.estadoConservacion = estadoConservacion;}

}
