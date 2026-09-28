package abstractfactory;
public class FabricaColeccion implements FabricaLibreria {

    @Override
    public Libro crearLibro(String titulo) {
        return new LibroFisico(titulo + " (Edicion De Coleccion)");
    }
    @Override
    public Separador crearSeparador() {
        return new SeparadorColeccion();
    }
}