public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica simulada de autenticación local
        System.out.println("Autenticando al usuario " + usuario + " de forma local...");
        return usuario.equals("admin") && contrasena.equals("1234");
    }
}
