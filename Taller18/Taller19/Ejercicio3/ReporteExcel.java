public class ReporteExcel implements GeneradorReporte{
    @Override
    public void generar(String contenido) {
        System.out.println("Generando hoja de cálculo en formato Excel...");
        System.out.println("Contenido Excel: [" + contenido + "]");
    }
}
