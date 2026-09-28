package abstractfactory;
public class LibroFisico implements Libro {
    private String titulo;

    public LibroFisico(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Libro: " + titulo);
    }
}