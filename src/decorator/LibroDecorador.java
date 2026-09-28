package decorator;
public abstract class LibroDecorador implements ComponenteLibro {
    protected ComponenteLibro libroDecorado;

    public LibroDecorador(ComponenteLibro libroDecorado) {
        this.libroDecorado = libroDecorado;
    }
}