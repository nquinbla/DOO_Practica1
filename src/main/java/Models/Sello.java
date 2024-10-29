package Models;

// Clase Sello que extiende ElementoColeccionable -> representa un sello coleccionable con atributos específicos de su naturaleza
public class Sello extends ElementoColeccionable {
    // [1] Atributos de la clase Sello -> Definen las características específicas de un sello coleccionable
    private double altura;                       // Altura del sello en milímetros
    private double anchura;                      // Anchura del sello en milímetros
    private String imagen;                       // Imagen o descripción visual del sello
    private EstadoConservacion estadoConservacion; // Estado de conservación del sello (ej., excelente, buena, regular)

    // [2] Constructor de la clase Sello -> Inicializa los atributos específicos de Sello y hereda los atributos de ElementoColeccionable
    public Sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio,
                 double altura, double anchura, String imagen, EstadoConservacion estadoConservacion) throws IllegalArgumentException {
        // Llama al constructor de la clase padre (ElementoColeccionable) para inicializar los atributos heredados
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);

        // Inicialización de los atributos específicos de Sello
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    // [3] Métodos de la clase Sello -> Getters y Setters para acceder y modificar los atributos específicos de Sello

    // Métodos "get" y "set" para el atributo altura
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Métodos "get" y "set" para el atributo anchura
    public double getAnchura() { return anchura; }
    public void setAnchura(double anchura) { this.anchura = anchura; }

    // Métodos "get" y "set" para el atributo imagen
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    // Métodos "get" y "set" para el atributo estadoConservacion
    public EstadoConservacion getEstadoConservacion() { return estadoConservacion; }
    public void setEstadoConservacion(EstadoConservacion estadoConservacion) { this.estadoConservacion = estadoConservacion; }
}
