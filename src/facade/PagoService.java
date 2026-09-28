package facade;
public class PagoService {

    public boolean procesarPago(String usuario, double monto) {
        System.out.println("Pago de $" + monto + " procesado correctamente para " + usuario);
        return true;
    }
}