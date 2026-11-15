public class Concerje implements Limpieza{
    @Override
    public void limpiar(String area) {
        System.out.println("El conserje está limpiando: " + area);
    }
}
