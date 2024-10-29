package ModelsAditivos;

import java.util.HashSet;
import java.util.Set;

public class UnidadesMonetariasValidas {
    // Conjuntos de unidades monetarias actuales y antiguas
    private static final Set<String> unidadesMonetariasActuales = new HashSet<>();
    private static final Set<String> unidadesMonetariasAntiguas = new HashSet<>();

    // Bloque estático para inicializar los conjuntos con valores específicos
    static {
        // Unidades monetarias actuales
        unidadesMonetariasActuales.add("USD"); // Dólar estadounidense
        unidadesMonetariasActuales.add("EUR"); // Euro
        unidadesMonetariasActuales.add("JPY"); // Yen japonés
        unidadesMonetariasActuales.add("GBP"); // Libra esterlina
        unidadesMonetariasActuales.add("AUD"); // Dólar australiano
        unidadesMonetariasActuales.add("CAD"); // Dólar canadiense
        unidadesMonetariasActuales.add("CHF"); // Franco suizo
        unidadesMonetariasActuales.add("CNY"); // Yuan chino
        unidadesMonetariasActuales.add("SEK"); // Corona sueca
        unidadesMonetariasActuales.add("NZD"); // Dólar neozelandés

        // Unidades monetarias antiguas
        unidadesMonetariasAntiguas.add("Dracma");             // Antigua moneda griega
        unidadesMonetariasAntiguas.add("Sestercio");          // Antigua moneda romana
        unidadesMonetariasAntiguas.add("Denario");             // Antigua moneda romana
        unidadesMonetariasAntiguas.add("Áureo");                // Antigua moneda romana de oro
        unidadesMonetariasAntiguas.add("Solidus");             // Antigua moneda romana de oro
        unidadesMonetariasAntiguas.add("Tetradracma");   // Antigua moneda griega
        unidadesMonetariasAntiguas.add("Obolo");               // Antigua moneda griega
        unidadesMonetariasAntiguas.add("Estatero");          // Antigua moneda griega
    }

    // Método estático que verifica si una unidad monetaria es válida
    public static boolean esUnidadMonetariaValida(String unidadMonetaria, boolean esAntigua) {
        // Retorna true si la unidad monetaria está en el conjunto correspondiente, de lo contrario false
        if (esAntigua) {
            return unidadesMonetariasAntiguas.contains(unidadMonetaria);
        } else {
            return unidadesMonetariasActuales.contains(unidadMonetaria);
        }
    }
}