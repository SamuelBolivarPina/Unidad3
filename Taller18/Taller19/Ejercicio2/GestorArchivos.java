public class GestorArchivos {

    public Almacenamiento almacenamiento; // Depende de la abstracción

    // Inyección de dependencias
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
