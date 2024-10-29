package ModelsAditivos;

import java.util.Arrays;
import java.util.List;

public class AleacionesValidas {
    // Lista de aleaciones válidas, inicializada con valores específicos
    private static final List<String> aleacionesValidas = Arrays.asList("Oro", "Plata", "Cobre", "Níquel", "Bronce");

    // Método estático que verifica si una aleación es válida
    public static boolean esAleacionValida(String aleacion) {
        // Retorna true si la aleación está en la lista de aleaciones válidas, de lo contrario false
        return aleacionesValidas.contains(aleacion);
    }
}