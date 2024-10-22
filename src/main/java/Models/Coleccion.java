package Models;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<ElementoColeccionable> elementos;

    public Coleccion() {this.elementos = new ArrayList<>();}

    // Añadir una moneda a la colección
    public void anadirMoneda(Moneda moneda) {elementos.add(moneda);}

    // Añadir un sello a la colección
    public void anadirSello(Sello sello) {elementos.add(sello);}

    // Mostrar las monedas de la colección
    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento);
            }
        }
    }

    // Mostrar los sellos de la colección
    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
                System.out.println(elemento);
            }
        }
    }

    // Obtener el precio total de la colección
    public double obtenerPrecioTotal() {
        double precioTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal;
    }

    // Obtener la rareza media de la colección
    public double obtenerRarezaMedia() {
        if (elementos.isEmpty()) {
            return 0;
        }
        double rarezaTotal = 0;
        for (ElementoColeccionable elemento : elementos) {
            rarezaTotal += elemento.getRareza();
        }
        return rarezaTotal / elementos.size();
    }
}
