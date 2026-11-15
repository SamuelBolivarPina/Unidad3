public class GestorReportes {
    public GeneradorReporte generadorReporte; // Depende de la abstracción, no de clases concretas

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }
}
