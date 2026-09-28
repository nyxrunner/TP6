package factorymethod;
public class MainFactoryMethod {

    public static void main(String[] args) {
        CreadorLibro creadorFisico = new CreadorLibroFisico();
        CreadorLibro creadorDigital = new CreadorLibroDigital();

        Libro libroJuan = creadorFisico.crearLibro("El principito");
        Libro libroMatias = creadorDigital.crearLibro("Indigno de ser humano");
        Libro libroIgnacio = creadorFisico.crearLibro("La metamorfosis");

        libroJuan.mostrarDetalle();
        libroMatias.mostrarDetalle();
        libroIgnacio.mostrarDetalle();
    }
}