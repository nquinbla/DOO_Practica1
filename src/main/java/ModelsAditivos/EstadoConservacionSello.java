// src/Main/java/ModelsAditivos/EstadoConservacionSello.java
package ModelsAditivos;

public class EstadoConservacionSello {
    public enum Estado {
        U, NSG, NF, N
    }

    private Estado estado;

    public EstadoConservacionSello(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado.name();
    }
}