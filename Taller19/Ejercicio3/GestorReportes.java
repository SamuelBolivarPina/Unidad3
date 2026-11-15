public class GestorReportes {
    public GeneradorReporte generadorReporte; // Depende de la abstracción, no de clases concretas

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }
    public void procesarReporte(String datos) {
        System.out.println("Procesando datos para el informe...");
        generadorReporte.generar(datos);
        System.out.println("¡Reporte procesado y exportado exitosamente!");
    }
}
