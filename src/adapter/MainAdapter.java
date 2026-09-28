package adapter;

public class MainAdapter {

    public static void main(String[] args) {
        ServicioEnvioViejo legacy = new ServicioEnvioViejo();
        ProcesadorEnvio adaptador = new AdaptadorEnvio(legacy);

        System.out.println("Cliente: Samuel");
        adaptador.enviar("La metamorfosis", 0.35);
    }
}