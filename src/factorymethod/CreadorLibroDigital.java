package factorymethod;
public class CreadorLibroDigital extends CreadorLibro {

    @Override
    public Libro crearLibro(String titulo) {
        return new LibroDigital(titulo);
    }
}