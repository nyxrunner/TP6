package adapter;
public class AdaptadorEnvio implements ProcesadorEnvio {
    private ServicioEnvioViejo servicioViejo;

    public AdaptadorEnvio(ServicioEnvioViejo servicioViejo) {
        this.servicioViejo = servicioViejo;
    }

    @Override
    public void enviar(String tituloLibro, double pesoKg) {
        int gramos = (int) (pesoKg * 1000);
        System.out.println("Enviando libro: " + tituloLibro);
        servicioViejo.despacharPaquete(gramos);
    }
}