public class Camion implements Conducible,TransportaMercancia{
    public String placa;

    public Camion(String placa) {
        this.placa = placa;
    }
    @Override
    public void conducir() {
        System.out.println("El camión con placa " + placa + " está circulando por la carretera.");
    }

    @Override
    public void cargarMercancia(double kilos) {
        System.out.println("El camión ha cargado " + kilos + " kg de mercancía de forma segura.");
    }
}
