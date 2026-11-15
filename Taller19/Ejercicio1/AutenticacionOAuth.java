public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica simulada de autenticación con proveedor externo (ej. Google/GitHub)
        System.out.println("Autenticando al usuario " + usuario + " mediante proveedor OAuth...");
        return true; // Simulamos éxito externo
    }
}
