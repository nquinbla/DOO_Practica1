package Models;


public class ElementoColeccionable {
    // [1] Atributos de la clase ElementoColeccionable
    private String pais;
    private String autoridadGobernante; //
    private int annus;
    private double valor;
    private String unidadMonetaria;
    private int rareza;
    private double precio;

    // [2] Constructor de la clase ElementoColeccionable
    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio) throws IllegalArgumentException {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("El índice de rareza debe estar entre 1 y 100.");
        }
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }

    // [3] Getters y Setters
    public String getPais() {return pais;}
    public String getAutoridadGobernante() {return autoridadGobernante;}
    public int getAnnus() {return annus;}
    public double getValor() {return valor;}
    public String getUnidadMonetaria() {return unidadMonetaria;}
    public int getRareza() {return rareza;}
    public double getPrecio() {return precio;}

    public void setPais(String pais) {this.pais = pais;}
    public void setAutoridadGobernante(String autoridadGobernante) {this.autoridadGobernante = autoridadGobernante;}
    public void setAnnus(int annus) {this.annus = annus;}
    public void setValor(double valor) {this.valor = valor;}
    public void setUnidadMonetaria(String unidadMonetaria) {this.unidadMonetaria = unidadMonetaria;}
    public void setRareza(int rareza) {this.rareza = rareza;}
    public void setPrecio(double precio) {this.precio = precio;}

}
