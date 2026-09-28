package facade;
public class MainFacade {

    public static void main(String[] args) {
        VentaFacade fachada = new VentaFacade();
        fachada.realizarCompra("El principito", "La Red Escrita", 8500.0);
    }
}