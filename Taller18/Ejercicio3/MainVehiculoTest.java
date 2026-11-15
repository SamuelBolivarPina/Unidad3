public class MainVehiculoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 18: EJERCICIO 3 (ISP VEHÍCULOS) ---");

        // 1. Probando el Camión con sus dos interfaces específicas
        Camion miCamion = new Camion("ABC-123");
        miCamion.conducir();
        miCamion.cargarMercancia(5000.0);
    }
}

