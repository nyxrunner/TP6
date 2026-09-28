package abstractfactory;
public class MainAbstractFactory {

    public static void main(String[] args) {
        FabricaLibreria fabricaColeccion = new FabricaColeccion();
        Libro libroJuan = fabricaColeccion.crearLibro("El principito");
        Separador separadorJuan = fabricaColeccion.crearSeparador();

        FabricaLibreria fabricaClasica = new FabricaClasica();
        Libro libroMatias = fabricaClasica.crearLibro("Indigno de ser humano");
        Separador separadorMatias = fabricaClasica.crearSeparador();

        FabricaLibreria fabricaEdicion2000 = new FabricaClasica();
        Libro libroSamuel = fabricaEdicion2000.crearLibro("Metamorfosis");
        Separador separadorSamuel = fabricaEdicion2000.crearSeparador();

        System.out.println("Pedido de Juan:");
        libroJuan.mostrarDetalle();
        separadorJuan.obtenerEstilo();

        System.out.println("---");
        System.out.println("Pedido de Matias:");
        libroMatias.mostrarDetalle();
        separadorMatias.obtenerEstilo();

        System.out.println("---");
        System.out.println("Pedido de Samuel:");
        libroMatias.mostrarDetalle();
        separadorMatias.obtenerEstilo();
    }
}