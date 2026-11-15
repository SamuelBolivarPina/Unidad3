public class Tecnico implements Reparacion{
    @Override
    public void reparar(String equipo) {
        System.out.println("El técnico está reparando: " + equipo);
    }
}
