package ModelsAditivos;

import java.util.HashSet;
import java.util.Set;

public class UnidadesMonetariasValidas {
    private static final Set<String> unidadesMonetariasActuales = new HashSet<>();
    private static final Set<String> unidadesMonetariasAntiguas = new HashSet<>();

    static {
        unidadesMonetariasActuales.add("USD");
        unidadesMonetariasActuales.add("EUR");
        unidadesMonetariasActuales.add("JPY");
        unidadesMonetariasActuales.add("GBP");
        unidadesMonetariasActuales.add("AUD");
        unidadesMonetariasActuales.add("CAD");
        unidadesMonetariasActuales.add("CHF");
        unidadesMonetariasActuales.add("CNY");
        unidadesMonetariasActuales.add("SEK");
        unidadesMonetariasActuales.add("NZD");

        unidadesMonetariasAntiguas.add("Dracma");
        unidadesMonetariasAntiguas.add("Sestercio");
        unidadesMonetariasAntiguas.add("Denario");
        unidadesMonetariasAntiguas.add("Áureo");
        unidadesMonetariasAntiguas.add("Solidus");
        unidadesMonetariasAntiguas.add("Tetradracma");
        unidadesMonetariasAntiguas.add("Obolo");
        unidadesMonetariasAntiguas.add("Estatero");
    }

    public static boolean esUnidadMonetariaValida(String unidadMonetaria, boolean esAntigua) {
        if (esAntigua) {
            return unidadesMonetariasAntiguas.contains(unidadMonetaria);
        } else {
            return unidadesMonetariasActuales.contains(unidadMonetaria);
        }
    }
}