import Models.Coleccion;
import Models.EstadoConservacion;
import Models.Moneda;
import Models.Sello;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------- MENÚ ---------------");
            System.out.println("Bienvenido al programa de colección de monedas y sellos.");
            System.out.println("(1). Añadir una nueva moneda");
            System.out.println("(2). Añadir un nuevo sello");
            System.out.println("(3). Mostrar todas las monedas");
            System.out.println("(4). Mostrar todos los sellos");
            System.out.println("(5). Mostrar el precio total de la colección");
            System.out.println("(6). Mostrar la rareza media de la colección");
            System.out.println("(0). Salir");
            System.out.print("Por favor, seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el país: ");
                    String pais = scanner.nextLine();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    String autoridadGobernante = scanner.nextLine();
                    System.out.print("Ingrese el año: ");
                    int annus = scanner.nextInt();
                    System.out.print("Ingrese el valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la unidad monetaria: ");
                    String unidadMonetaria = scanner.nextLine();
                    System.out.print("Ingrese la rareza (1-100): ");
                    int rareza = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la composición: ");
                    String composicion = scanner.nextLine();
                    System.out.print("Ingrese el peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese el diámetro: ");
                    double diametro = scanner.nextDouble();
                    System.out.print("Ingrese el grosor: ");
                    double grosor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                    EstadoConservacion estadoConservacion = EstadoConservacion.valueOf(scanner.nextLine());
                    Moneda moneda = new Moneda(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
                    coleccion.anadirMoneda(moneda);
                    break;
                case 2:
                    System.out.print("Ingrese el país: ");
                    pais = scanner.nextLine();
                    System.out.print("Ingrese la autoridad gobernante: ");
                    autoridadGobernante = scanner.nextLine();
                    System.out.print("Ingrese el año: ");
                    annus = scanner.nextInt();
                    System.out.print("Ingrese el valor: ");
                    valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la unidad monetaria: ");
                    unidadMonetaria = scanner.nextLine();
                    System.out.print("Ingrese la rareza (1-100): ");
                    rareza = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    precio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Ingrese la anchura: ");
                    double anchura = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese la imagen: ");
                    String imagen = scanner.nextLine();
                    System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                    estadoConservacion = EstadoConservacion.valueOf(scanner.nextLine());
                    Sello sello = new Sello(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, altura, anchura, imagen, estadoConservacion);
                    coleccion.anadirSello(sello);
                    break;
                case 3:
                    System.out.println("--- Monedas ---");
                    System.out.println("Lista de monedas guardadas:");
                    coleccion.mostrarMonedas();
                    break;
                case 4:
                    System.out.println("--- Sellos ---");
                    System.out.println("Lista de sellos guardados:");
                    coleccion.mostrarSellos();
                    break;
                case 5:
                    System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                    break;
                case 6:
                    System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}