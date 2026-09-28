package singleton;
public class ConfigLibreria {
    private static ConfigLibreria instancia;
    private String nombreTienda;
    private String moneda;

    private ConfigLibreria() {
        this.nombreTienda = "Libreria Central UNSTA";
        this.moneda = "ARS";
    }
    public static ConfigLibreria getInstancia() {
        if (instancia == null) {
            instancia = new ConfigLibreria();
        }
        return instancia;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}