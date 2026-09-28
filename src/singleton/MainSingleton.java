package singleton;
public class MainSingleton {

    public static void main(String[] args) {
        Cliente juan = new Cliente("Juan");
        Cliente matias = new Cliente("Matias");
        Cliente ignacio = new Cliente("Ignacio");

        juan.consultarConfiguracion();

        GestorLibreria gestor = new GestorLibreria();
        gestor.cambiarNombreTienda("La Red Escrita");

        matias.consultarConfiguracion();
        ignacio.consultarConfiguracion();
    }
}