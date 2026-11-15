public class GestorAutenticacion {
    public ServicioAutenticacion servicioAutenticacion; // Depende de la abstracción, no de una clase concreta

    // Inyección de dependencias por constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        boolean exito = servicioAutenticacion.autenticar(usuario, contrasena);
        if (exito) {
            System.out.println("¡Inicio de sesión exitoso!\n");
        } else {
            System.out.println("Error: Credenciales inválidas.\n");
        }
    }
}
