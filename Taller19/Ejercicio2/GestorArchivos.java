public class GestorArchivos {

    public Almacenamiento almacenamiento; // Depende de la abstracción

    // Inyección de dependencias
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void respaldar(String nombreArchivo) {
        System.out.println("Iniciando proceso de respaldo...");
        almacenamiento.guardarArchivo(nombreArchivo);
        System.out.println("¡Respaldo completado con éxito!\n");
    }
    public void descargar(String nombreArchivo) {
        System.out.println("Iniciando proceso de descarga...");
        String contenido = almacenamiento.recuperarArchivo(nombreArchivo);
        System.out.println("Archivo recuperado con contenido: [" + contenido + "]\n");
    }
}
