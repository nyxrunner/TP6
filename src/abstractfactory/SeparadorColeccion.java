package abstractfactory;
public class SeparadorColeccion implements Separador {

    @Override
    public void obtenerEstilo() {
        System.out.println("Separador de tela bordada especial.");
    }
}