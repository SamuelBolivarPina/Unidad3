public class MainReporteTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 19: EJERCICIO 3 (DIP REPORTES) ---");

        // 1. Generando reporte en PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.procesarReporte("Resumen de notas - Unidad 3 POO");
    }
}
