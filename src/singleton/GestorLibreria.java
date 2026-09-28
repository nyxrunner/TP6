package singleton;
public class GestorLibreria {

    public void cambiarNombreTienda(String nuevoNombre) {
        ConfigLibreria config = ConfigLibreria.getInstancia();
        config.setNombreTienda(nuevoNombre);
        System.out.println("El gestor cambio el nombre de la tienda a: " + nuevoNombre);
    }
}