public class MainAutenticadorTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 19: EJERCICIO 1 (DIP) ---");

        // 1. Usando autenticación local
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(authLocal);
        gestor1.iniciarSesion("admin", "1234");
    }
}
