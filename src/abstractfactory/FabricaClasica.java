package abstractfactory;
public class FabricaClasica implements FabricaLibreria {

    @Override
    public Libro crearLibro(String titulo) {
        return new LibroFisico(titulo + " (Edicion Clasica)");
    }
    @Override
    public Separador crearSeparador() {
        return new SeparadorClasico();
    }
}