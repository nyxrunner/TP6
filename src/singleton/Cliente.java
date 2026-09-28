package singleton;
public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void consultarConfiguracion() {
        ConfigLibreria config = ConfigLibreria.getInstancia();
        System.out.println("Cliente " + nombre + " ve la tienda: " + config.getNombreTienda() + " (" + config.getMoneda() + ")");
    }
}