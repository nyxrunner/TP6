package singleton;
public class Libro {
    private String titulo;
    private double precioBase;

    public Libro(String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}