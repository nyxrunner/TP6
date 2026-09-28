package decorator;
public class DecoradorFirmaAutor extends LibroDecorador {
    public DecoradorFirmaAutor(ComponenteLibro libro) {
        super(libro);
    }

    @Override
    public String getDescripcion() {
        return libroDecorado.getDescripcion() + " + Firma del autor";
    }
    @Override
    public double getPrecio() {
        return libroDecorado.getPrecio() + 3000.0;
    }
}