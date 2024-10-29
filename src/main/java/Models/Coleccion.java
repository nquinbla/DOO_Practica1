package Models;

import java.util.ArrayList;
import java.util.List;

// Clase Coleccion -> Representa una colección de elementos coleccionables, como monedas y sellos
public class Coleccion {
    // [1] Atributos de la clase Coleccion -> Contiene una lista de elementos coleccionables
    private List<Moneda> monedas; // Lista de monedas en la colección
    private List<Sello> sellos;   // Lista de sellos en la colección

    // [2] Constructor de la clase Coleccion -> Inicializa una nueva colección vacía
    public Coleccion() {
        this.monedas = new ArrayList<>(); // Inicializa la lista de monedas
        this.sellos = new ArrayList<>();  // Inicializa la lista de sellos
    }

    // [3] Métodos de la clase Coleccion -> Permiten gestionar y obtener información de la colección

    // Método para añadir una moneda a la colección
    public void anadirMoneda(Moneda moneda) {
        monedas.add(moneda); // Añade el objeto Moneda a la lista de monedas
    }

    // Método para añadir un sello a la colección
    public void anadirSello(Sello sello) {
        sellos.add(sello); // Añade el objeto Sello a la lista de sellos
    }

    // Método para mostrar todas las monedas en la colección
    public void mostrarMonedas() {
        for (Moneda moneda : monedas) {
            System.out.println(moneda); // Imprime la información de la moneda
        }
    }

    // Método para mostrar todos los sellos en la colección
    public void mostrarSellos() {
        for (Sello sello : sellos) {
            System.out.println(sello); // Imprime la información del sello
        }
    }

    // Método para calcular el precio total de todos los elementos en la colección
    public double obtenerPrecioTotal() {
        double precioTotal = 0; // Variable acumuladora para el precio total
        for (Moneda moneda : monedas) {
            precioTotal += moneda.getPrecio();
        }
        for (Sello sello : sellos) {
            precioTotal += sello.getPrecio();
        }
        return precioTotal; // Devuelve el precio total de la colección
    }

    // Método para calcular la rareza media de los elementos en la colección
    public double obtenerRarezaMedia() {
        int totalElementos = monedas.size() + sellos.size();
        if (totalElementos == 0) {
            return 0;
        }
        double rarezaTotal = 0; // Variable acumuladora para la rareza total
        for (Moneda moneda : monedas) {
            rarezaTotal += moneda.getRareza();
        }
        for (Sello sello : sellos) {
            rarezaTotal += sello.getRareza();
        }
        return rarezaTotal / totalElementos; // Calcula y devuelve la rareza media
    }
}