public class AutoParticular implements Conducible{
    public String modelo;

    public AutoParticular(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void conducir() {
        System.out.println("El auto particular " + modelo + " está siendo conducido por la ciudad.");
    }
}
