public class GestorAutenticacion {
    public ServicioAutenticacion servicioAutenticacion; // Depende de la abstracción, no de una clase concreta

    // Inyección de dependencias por constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }
}
