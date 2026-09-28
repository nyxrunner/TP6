package facade;
public class InventarioService {

    public boolean verificarStock(String libro) {
        System.out.println("Stock verificado con exito para: " + libro);
        return true;
    }
}