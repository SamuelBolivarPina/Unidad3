public class CuentaCorriente implements Transferencia,Retiro,PagoFacturas{
    public String titular;
    public double saldo;

    public CuentaCorriente(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    @Override
    public void transferir(String cuentaDestino, double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println(titular + " transfirió $" + monto + " a la cuenta " + cuentaDestino);
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println(titular + " retiró $" + monto);
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println(titular + " pagó la factura de " + factura + " por un monto de $" + monto);
        } else {
            System.out.println("Saldo insuficiente para pagar la factura.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
