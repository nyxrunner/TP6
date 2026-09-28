package decorator;
public class DecoradorEmpaqueRegalo extends LibroDecorador {
    public DecoradorEmpaqueRegalo(ComponenteLibro libro) {
        super(libro);
    }

    @Override
    public String getDescripcion() {
        return libroDecorado.getDescripcion() + " + Empaque de regalo";
    }
    @Override
    public double getPrecio() {
        return libroDecorado.getPrecio() + 1500.0;
    }
}