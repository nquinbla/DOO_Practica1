import Models.Coleccion;
import ModelsAditivos.*;
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

            switch (opcion) { // [ Opción 1: Añadir una nueva moneda ]
                case 1:
                    System.out.println();
                    System.out.println("--- Añadir Moneda ---");
                    System.out.println("A continuación, se le pedirá que ingrese los siguientes datos: país, autoridad gobernante, año, valor, unidad monetaria, rareza, precio, composición, peso, diámetro, grosor y estado de conservación.");

                    String pais; // País de la moneda
                    do {
                        System.out.print("Ingrese el país: ");
                        pais = scanner.nextLine();
                        if (!PaisesValidos.esPaisValido(pais)) {
                            System.out.println("País equivocado. Por favor, ingrese un país válido.");
                        }
                    } while (!PaisesValidos.esPaisValido(pais));

                    System.out.print("Ingrese la autoridad gobernante: "); // Autoridad gobernante de la moneda
                    String autoridadGobernante = scanner.nextLine();

                    int annus; // Año de la moneda
                    do {
                        System.out.print("Ingrese el año (-700 a.C. a 2024 d.C.): ");
                        annus = scanner.nextInt();
                        if (annus < -700 || annus > 2024) {
                            System.out.println("Año inválido. Por favor, ingrese un año entre el -700 y 2024.");
                        }
                    } while (annus < -700 || annus > 2024);

                    double valor; // Valor de la moneda
                    do {
                        System.out.print("Ingrese el valor (en euros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        valor = scanner.nextDouble();
                        if (valor < 0) {
                            System.out.println("Valor inválido. Por favor, ingrese un valor positivo.");
                        }
                    } while (valor < 0);
                    scanner.nextLine();

                    boolean esAntigua; // Si la moneda es antigua o no
                    String respuesta;
                    do {
                        System.out.print("¿Es una moneda antigua? (sí/no): ");
                        respuesta = scanner.nextLine().trim().toLowerCase();
                        esAntigua = respuesta.equals("sí");
                        if (!respuesta.equals("sí") && !respuesta.equals("no")) {
                            System.out.println("Respuesta inválida. Por favor, responda 'sí' o 'no'.");
                        }
                    } while (!respuesta.equals("sí") && !respuesta.equals("no"));

                    String unidadMonetaria; // Unidad monetaria de la moneda
                    do {
                        System.out.print("Ingrese la unidad monetaria: ");
                        unidadMonetaria = scanner.nextLine();
                        if (!UnidadesMonetariasValidas.esUnidadMonetariaValida(unidadMonetaria, esAntigua)) {
                            System.out.println("Unidad monetaria inválida. Por favor, ingrese una unidad monetaria válida.");
                        }
                    } while (!UnidadesMonetariasValidas.esUnidadMonetariaValida(unidadMonetaria, esAntigua));

                    int rareza = 0; // Rareza de la moneda
                    boolean rarezaValida = false;
                    do {
                        System.out.print("Ingrese la rareza (1-100, siendo 1 lo menos raro y 100 lo más raro): ");
                        String rarezaInput = scanner.nextLine().trim();
                        try {
                            rareza = Integer.parseInt(rarezaInput);
                            if (rareza >= 1 && rareza <= 100) {
                                rarezaValida = true;
                            } else {
                                System.out.println("Rareza inválida. Por favor, ingrese un número entre 1 y 100.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número entre 1 y 100.");
                        }
                    } while (!rarezaValida);

                    double precio; // Precio de la moneda
                    do {
                        System.out.print("Ingrese el precio: ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        precio = scanner.nextDouble();
                        if (precio < 0) {
                            System.out.println("Precio inválido. Por favor, ingrese un precio positivo.");
                        }
                    } while (precio < 0);
                    scanner.nextLine();

                    String composicion; // Composición de la moneda
                    do {
                        System.out.print("Ingrese la composición o aleación: ");
                        composicion = scanner.nextLine();
                        if (!AleacionesValidas.esAleacionValida(composicion)) {
                            System.out.println("Composición inválida. Por favor, ingrese una aleación válida.");
                        }
                    } while (!AleacionesValidas.esAleacionValida(composicion));

                    double peso; // Peso de la moneda
                    do {
                        System.out.print("Ingrese el peso (en gramos): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        peso = scanner.nextDouble();
                        if (peso < 0) {
                            System.out.println("Peso inválido. Por favor, ingrese un peso positivo.");
                        }
                    } while (peso < 0);
                    scanner.nextLine();

                    double diametro; // Diámetro de la moneda
                    do {
                        System.out.print("Ingrese el diámetro (en milímetros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        diametro = scanner.nextDouble();
                        if (diametro < 0) {
                            System.out.println("Diámetro inválido. Por favor, ingrese un diámetro positivo.");
                        }
                    } while (diametro < 0);
                    scanner.nextLine();

                    double grosor; // Grosor de la moneda
                    do {
                        System.out.print("Ingrese el grosor (en milímetros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        grosor = scanner.nextDouble();
                        if (grosor < 0) {
                            System.out.println("Grosor inválido. Por favor, ingrese un grosor positivo.");
                        }
                    } while (grosor < 0);
                    scanner.nextLine();

                    EstadoConservacion estadoConservacion = null; // Estado de conservación de la moneda
                    boolean estadoValido = false;
                    do {
                        System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                        String estadoInput = scanner.nextLine().trim().toUpperCase();
                        try {
                            estadoConservacion = EstadoConservacion.valueOf(estadoInput);
                            estadoValido = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Estado de conservación inválido. Por favor, ingrese un estado válido.");
                        }
                    } while (!estadoValido);

                    Moneda moneda = new Moneda(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio, composicion, peso, diametro, grosor, estadoConservacion);
                    coleccion.anadirMoneda(moneda);
                    break;

                case 2: // [ Opción 2: Añadir un nuevo sello ]
                    System.out.println();
                    System.out.println("--- Añadir Sello ---");
                    System.out.println("A continuación, se le pedirá que ingrese los siguientes datos: país, autoridad gobernante, año, valor, unidad monetaria, rareza, precio, altura, anchura, imagen y estado de conservación.");

                    do {
                        System.out.print("Ingrese el país: "); // País del sello
                        pais = scanner.nextLine();
                        if (!PaisesValidos.esPaisValido(pais)) {
                            System.out.println("País equivocado. Por favor, ingrese un país válido.");
                        }
                    } while (!PaisesValidos.esPaisValido(pais));

                    System.out.print("Ingrese la autoridad gobernante: "); // Autoridad gobernante del sello
                    String autoridadGobernanteSello = scanner.nextLine();

                    do { // Año del sello
                        System.out.print("Ingrese el año (-700 a.C. a 2024 d.C.): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un año válido.");
                            scanner.next();
                        }
                        annus = scanner.nextInt();
                        if (annus < -700 || annus > 2024) {
                            System.out.println("Año inválido. Por favor, ingrese un año entre el -700 y 2024.");
                        }
                    } while (annus < -700 || annus > 2024);
                    scanner.nextLine();

                    double valorSello; // Valor del sello
                    do {
                        System.out.print("Ingrese el valor (en euros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        valorSello = scanner.nextDouble();
                        if (valorSello < 0) {
                            System.out.println("Valor inválido. Por favor, ingrese un valor positivo.");
                        }
                    } while (valorSello < 0);
                    scanner.nextLine();

                    boolean esAntiguaSello; // Si el sello es antiguo o no
                    String respuestaSello;
                    do {
                        System.out.print("¿Es una moneda antigua? (sí/no): ");
                        respuestaSello = scanner.nextLine().trim().toLowerCase();
                        esAntiguaSello = respuestaSello.equals("sí");
                        if (!respuestaSello.equals("sí") && !respuestaSello.equals("no")) {
                            System.out.println("Respuesta inválida. Por favor, responda 'sí' o 'no'.");
                        }
                    } while (!respuestaSello.equals("sí") && !respuestaSello.equals("no"));

                    String unidadMonetariaSello; // Unidad monetaria del sello [?]
                    do {
                        System.out.print("Ingrese la unidad monetaria: ");
                        unidadMonetariaSello = scanner.nextLine();
                        if (!UnidadesMonetariasValidas.esUnidadMonetariaValida(unidadMonetariaSello, esAntiguaSello)) {
                            System.out.println("Unidad monetaria inválida. Por favor, ingrese una unidad monetaria válida.");
                        }
                    } while (!UnidadesMonetariasValidas.esUnidadMonetariaValida(unidadMonetariaSello, esAntiguaSello));

                    int rarezaSello = 0; // Rareza del sello
                    boolean rarezaSelloValida = false;
                    do {
                        System.out.print("Ingrese la rareza (1-100, siendo 1 lo menos raro y 100 lo más raro): ");
                        String rarezaSelloInput = scanner.nextLine().trim();
                        try {
                            rarezaSello = Integer.parseInt(rarezaSelloInput);
                            if (rarezaSello >= 1 && rarezaSello <= 100) {
                                rarezaSelloValida = true;
                            } else {
                                System.out.println("Rareza inválida. Por favor, ingrese un número entre 1 y 100.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número entre 1 y 100.");
                        }
                    } while (!rarezaSelloValida);

                    double precioSello; // Precio del sello
                    do {
                        System.out.print("Ingrese el precio (en euros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        precioSello = scanner.nextDouble();
                        if (precioSello < 0) {
                            System.out.println("Precio inválido. Por favor, ingrese un precio positivo.");
                        }
                    } while (precioSello < 0);
                    scanner.nextLine();

                    double altura; // Altura del sello
                    do {
                        System.out.print("Ingrese la altura (en milímetros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        altura = scanner.nextDouble();
                        if (altura < 0) {
                            System.out.println("Altura inválida. Por favor, ingrese una altura positiva.");
                        }
                    } while (altura < 0);
                    scanner.nextLine();

                    double anchura; // Anchura del sello
                    do {
                        System.out.print("Ingrese la anchura (en milímetros): ");
                        while (!scanner.hasNextDouble()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            scanner.next();
                        }
                        anchura = scanner.nextDouble();
                        if (anchura < 0) {
                            System.out.println("Anchura inválida. Por favor, ingrese una anchura positiva.");
                        }
                    } while (anchura < 0);
                    scanner.nextLine();

                    System.out.print("Ingrese la imagen: "); // Imagen del sello
                    String imagen = scanner.nextLine();

                    EstadoConservacionSello estadoConservacionSello = null; // Estado de conservación del sello
                    boolean estadoSelloValido = false;
                    do {
                        System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                        String estadoSelloInput = scanner.nextLine().trim().toUpperCase();
                        try {
                            estadoConservacionSello = new EstadoConservacionSello(EstadoConservacionSello.Estado.valueOf(estadoSelloInput));
                            estadoSelloValido = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Estado de conservación inválido. Por favor, ingrese un estado válido.");
                        }
                    } while (!estadoSelloValido);

                    Sello sello = new Sello(pais, autoridadGobernanteSello, annus, valorSello, unidadMonetariaSello, rarezaSello, precioSello, altura, anchura, imagen, estadoConservacionSello);
                    coleccion.anadirSello(sello);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("--- Monedas ---");
                    System.out.println("Lista de monedas guardadas:");
                    coleccion.mostrarMonedas();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("--- Sellos ---");
                    System.out.println("Lista de sellos guardados:");
                    coleccion.mostrarSellos();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("--- Precio Colección ---");
                    System.out.println("El precio total de la colección es de: " + coleccion.obtenerPrecioTotal());
                    break;

                case 6:
                    System.out.println();
                    System.out.println("--- Rareza Media ---");
                    System.out.println("La rareza media de la colección es de: " + coleccion.obtenerRarezaMedia());
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intentelo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}