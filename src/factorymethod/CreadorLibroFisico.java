package factorymethod;
public class CreadorLibroFisico extends CreadorLibro {

    @Override
    public Libro crearLibro(String titulo) {
        return new LibroFisico(titulo);
    }
}