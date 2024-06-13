package ejercicio1;

import ejercicio1.DistanciaWebService.CalculoDistancia;

public class Envio {

    private Transporte estrategiaEnvio;

    public Envio(Transporte transporte){
        estrategiaEnvio = transporte;
    }

    public void cambiarTransporte(Transporte transporte){
        estrategiaEnvio = transporte;
    }

    public double calcularEnvio(String destino, double peso, CalculoDistancia distancia){
        return estrategiaEnvio.totalEnvio(destino, peso, distancia);
    }
}
