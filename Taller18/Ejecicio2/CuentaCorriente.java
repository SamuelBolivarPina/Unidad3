public class CuentaCorriente implements Transferencia,Retiro,PagoFacturas{
    public String titular;
    public double saldo;

    public CuentaCorriente(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
}
