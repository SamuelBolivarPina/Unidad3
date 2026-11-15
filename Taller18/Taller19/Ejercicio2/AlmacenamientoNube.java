public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo) {
        System.out.println("Subiendo y guardando el archivo '" + nombreArchivo + "' en la nube (Cloud Storage).");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("Descargando el archivo '" + nombreArchivo + "' desde la nube.");
    }
}
