package Models;

import java.util.ArrayList;
import java.util.List;

// Clase Coleccion -> Representa una colección de elementos coleccionables, como monedas y sellos
public class Coleccion {
    // [1] Atributos de la clase Coleccion -> Contiene una lista de elementos coleccionables
    private List<ElementoColeccionable> elementos; // Lista de objetos ElementoColeccionable (monedas, sellos, etc.)

    // [2] Constructor de la clase Coleccion -> Inicializa una nueva colección vacía
    public Coleccion() {
        this.elementos = new ArrayList<>(); // Inicializa la lista como un ArrayList vacío
    }

    // [3] Métodos de la clase Coleccion -> Permiten gestionar y obtener información de la colección

    // Método para añadir una moneda a la colección
    public void anadirMoneda(Moneda moneda) { elementos.add(moneda); } // Añade el objeto Moneda a la lista de elementos

    // Método para añadir un sello a la colección
    public void anadirSello(Sello sello) { elementos.add(sello); } // Añade el objeto Sello a la lista de elementos


    // Método para mostrar todas las monedas en la colección
    public void mostrarMonedas() {
        // Recorre cada elemento en la lista
        for (ElementoColeccionable elemento : elementos) {
            // Comprueba si el elemento es una instancia de Moneda
            if (elemento instanceof Moneda) {
                System.out.println(elemento); // Imprime la información de la moneda
            }
        }
    }

    // Método para mostrar todos los sellos en la colección
    public void mostrarSellos() {
        // Recorre cada elemento en la lista
        for (ElementoColeccionable elemento : elementos) {
            // Comprueba si el elemento es una instancia de Sello
            if (elemento instanceof Sello) {
                System.out.println(elemento); // Imprime la información del sello
            }
        }
    }

    // Método para calcular el precio total de todos los elementos en la colección
    public double obtenerPrecioTotal() {
        double precioTotal = 0; // Variable acumuladora para el precio total
        // Recorre cada elemento en la lista y acumula el precio
        for (ElementoColeccionable elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal; // Devuelve el precio total de la colección
    }

    // Método para calcular la rareza media de los elementos en la colección
    public double obtenerRarezaMedia() {
        // Verifica si la colección está vacía; si lo está, devuelve 0
        if (elementos.isEmpty()) {
            return 0;
        }
        double rarezaTotal = 0; // Variable acumuladora para la rareza total
        // Recorre cada elemento en la lista y acumula la rareza
        for (ElementoColeccionable elemento : elementos) {
            rarezaTotal += elemento.getRareza();
        }
        // Calcula y devuelve la rareza media dividiendo la rareza total por el número de elementos
        return rarezaTotal / elementos.size();
    }
}
