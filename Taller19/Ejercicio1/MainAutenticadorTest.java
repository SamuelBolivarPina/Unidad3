public class MainAutenticadorTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 19: EJERCICIO 1 (DIP) ---");

        // 1. Usando autenticación local
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(authLocal);
        gestor1.iniciarSesion("admin", "1234");

        // 2. Cambiando a autenticación OAuth de forma transparente (Inversión de Dependencias)
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(authOAuth);
        gestor2.iniciarSesion("samuel_bolivar", "token_seguro");
    }
}

