package ModelsAditivos;

import java.util.Arrays;
import java.util.List;

public class AleacionesValidas {
    private static final List<String> aleacionesValidas = Arrays.asList("Oro", "Plata", "Cobre", "Níquel", "Bronce");

    public static boolean esAleacionValida(String aleacion) {
        return aleacionesValidas.contains(aleacion);
    }
}