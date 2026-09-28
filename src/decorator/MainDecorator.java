package decorator;
public class MainDecorator {
    public static void main(String[] args) {
        ComponenteLibro libroMatias = new LibroBase("Indigno de ser humano", 12000.0);
        libroMatias = new DecoradorEmpaqueRegalo(libroMatias);
        libroMatias = new DecoradorFirmaAutor(libroMatias);

        System.out.println("Compra de Matias:");
        System.out.println("Detalle: " + libroMatias.getDescripcion());
        System.out.println("Total: $" + libroMatias.getPrecio());
    }
}