package Models;

// [1] Clase abstracta ElementoColeccionable -> representa un objeto coleccionable con atributos específicos
public abstract class ElementoColeccionable {
    // Atributos de la clase ElementoColeccionable -> en él se definen las características esenciales de un objeto coleccionable
    private String pais;                                        // País de origen del elemento coleccionable
    private String autoridadGobernante;         // Autoridad o entidad que emite el elemento (ej., banco central)
    private int annus;                                           // Año de emisión o creación del elemento
    private double valor;                                    // Valor nominal o valor de referencia del elemento
    private String unidadMonetaria;                // Unidad monetaria en la que se expresa el valor
    private int rareza;                                         // Índice de rareza (1 a 100), donde un número mayor indica mayor rareza
    private double precio;                                // Precio de venta estimado del elemento en el mercado de coleccionistas

    // [2] Constructor de la clase ElementoColeccionable -> inicializa los atributos de la clase con los valores recibidos como parámetros
    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio) throws IllegalArgumentException {
        if (rareza < 1 || rareza > 100) {               // Validación: rareza debe estar en el rango de 1 a 100; si no, lanza una excepción
            throw new IllegalArgumentException("El índice de rareza debe estar entre 1 y 100.");
        }
        // Inicialización de los atributos de la clase
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }


    // [3] Métodos de la clase ElementoColeccionable -> permiten acceder y modificar los atributos de la clase

    // Métodos "get" para acceder a cada atributo
    public String getPais() { return pais; }
    public String getAutoridadGobernante() { return autoridadGobernante; }
    public int getAnnus() { return annus; }
    public double getValor() { return valor; }
    public String getUnidadMonetaria() { return unidadMonetaria; }
    public int getRareza() { return rareza; }
    public double getPrecio() { return precio; }

    // Métodos "set" para modificar los valores de cada atributo
    public void setPais(String pais) { this.pais = pais; }
    public void setAutoridadGobernante(String autoridadGobernante) { this.autoridadGobernante = autoridadGobernante; }
    public void setAnnus(int annus) { this.annus = annus; }
    public void setValor(double valor) { this.valor = valor; }
    public void setUnidadMonetaria(String unidadMonetaria) { this.unidadMonetaria = unidadMonetaria; }
    public void setRareza(int rareza) { this.rareza = rareza; }
    public void setPrecio(double precio) { this.precio = precio; }
}
