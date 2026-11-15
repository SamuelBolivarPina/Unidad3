public class ReportePDF implements GeneradorReporte{
    @Override
    public void generar(String contenido) {
        System.out.println("Generando documento oficial en formato PDF...");
        System.out.println("Contenido PDF: [" + contenido + "]");
    }
}
