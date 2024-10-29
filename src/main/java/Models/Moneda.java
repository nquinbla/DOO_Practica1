package Models;

import ModelsAditivos.EstadoConservacion;

// Clase Moneda que extiende ElementoColeccionable -> representa una moneda con atributos adicionales específicos de su naturaleza
public class Moneda extends ElementoColeccionable {
    // [1] Atributos de la clase Moneda -> Definen las características específicas de una moneda coleccionable
    private String composicion;                                              // Composición o aleación de la moneda (ej., oro, plata, cobre)
    private double peso;                                                          // Peso de la moneda en gramos
    private double diametro;                                                  // Diámetro de la moneda en milímetros
    private double grosor;                                                      // Grosor de la moneda en milímetros
    private EstadoConservacion estadoConservacion;  // Estado de conservación de la moneda (ej., excelente, buena, regular)

    // [2] Constructor de la clase Moneda -> Inicializa los atributos de Moneda y hereda los atributos de ElementoColeccionable
    public Moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio,
                  String composicion, double peso, double diametro, double grosor, EstadoConservacion estadoConservacion) throws IllegalArgumentException {
        // Llama al constructor de la clase padre (ElementoColeccionable) para inicializar los atributos heredados
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);

        // Inicialización de los atributos específicos de Moneda
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    // [3] Métodos de la clase Moneda -> Getters y Setters para acceder y modificar los atributos específicos de Moneda

    // Métodos "get" para acceder a los atributos de Moneda
    public String getComposicion() { return composicion; }
    public double getPeso() { return peso; }
    public double getDiametro() { return diametro; }
    public double getGrosor() { return grosor; }
    public EstadoConservacion getEstadoConservacion() { return estadoConservacion; }

    // Métodos "set" para modificar los valores de los atributos de Moneda
    public void setComposicion(String composicion) { this.composicion = composicion; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setDiametro(double diametro) { this.diametro = diametro; }
    public void setGrosor(double grosor) { this.grosor = grosor; }
    public void setEstadoConservacion(EstadoConservacion estadoConservacion) { this.estadoConservacion = estadoConservacion; }
}
