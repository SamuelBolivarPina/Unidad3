public class AlmacenamientoLocal implements Almacenamiento{
    @Override
    public void guardarArchivo(String nombreArchivo) {
        System.out.println("Guardando el archivo '" + nombreArchivo + "' en el disco duro local.");
    }
    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando el archivo '" + nombreArchivo + "' desde el almacenamiento local.");
    }
}
