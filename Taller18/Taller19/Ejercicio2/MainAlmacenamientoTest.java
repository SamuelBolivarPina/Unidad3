public class MainAlmacenamientoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 19: EJERCICIO 2 (DIP ALMACENAMIENTO) ---");

        // 1. Usando almacenamiento local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.respaldar("documento_poo.pdf");
    }
}
