package factorymethod;
public class LibroDigital implements Libro {
    private String titulo;

    public LibroDigital(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Libro digital: " + titulo + " (Formato PDF/ePub)");
    }
}