public class MainReporteTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 19: EJERCICIO 3 (DIP REPORTES) ---");

        // 1. Generando reporte en PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.procesarReporte("Resumen de notas - Unidad 3 POO");
    }
    // 2. Cambiando a reporte en Excel de forma transparente
    GeneradorReporte excel = new ReporteExcel();
    GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.procesarReporte("Inventario de notas de estudiantes");
}

