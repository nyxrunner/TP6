package facade;
public class VentaFacade {
    private InventarioService inventario;
    private PagoService pago;
    private EnvioService envio;

    public VentaFacade() {
        this.inventario = new InventarioService();
        this.pago = new PagoService();
        this.envio = new EnvioService();
    }

    public void realizarCompra(String libro, String usuario, double monto) {
        System.out.println("--- Iniciando proceso de compra ---");
        if (inventario.verificarStock(libro)) {
            if (pago.procesarPago(usuario, monto)) {
                envio.generarEnvio(libro, usuario);
                System.out.println("Compra finalizada con exito.");
            }
        }
    }
}