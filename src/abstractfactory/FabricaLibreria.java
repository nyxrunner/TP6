package abstractfactory;
public interface FabricaLibreria {

    Libro crearLibro(String titulo);
    Separador crearSeparador();
}