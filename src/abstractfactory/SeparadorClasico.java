package abstractfactory;
public class SeparadorClasico implements Separador {

    @Override
    public void obtenerEstilo() {
        System.out.println("Separador de cartulina simple.");
    }
}