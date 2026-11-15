public class MainMatenimientoTest {
        public static void main(String[] args) {
            System.out.println("--- PRUEBA TALLER 18: PRINCIPIO ISP ---");

            // 1. Probando el servicio de limpieza con el Concerje
            Limpieza concerje = new Concerje();
            concerje.limpiar("Pasillo Principal");

            // 2. Probando el servicio de reparación con el Técnico
            Reparacion tecnico = new Tecnico();
            tecnico.reparar("Sistema de Aire Acondicionado");
        }
    }
}
