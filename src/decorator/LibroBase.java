package decorator;
public class LibroBase implements ComponenteLibro {
    private String titulo;
    private double precio;

    public LibroBase(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return "Libro: " + titulo;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
}