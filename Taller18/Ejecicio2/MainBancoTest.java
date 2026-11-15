public class MainBancoTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA TALLER 18: EJERCICIO 2 (ISP BANCO) ---");

        CuentaCorriente miCuenta = new CuentaCorriente("Samuel", 1500000.0);

        // Usando las interfaces segregadas de forma polimórfica
        Transferencia t = miCuenta;
        t.transferir("987654321", 200000.0);
    }
}
