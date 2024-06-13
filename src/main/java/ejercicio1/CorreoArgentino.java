package ejercicio1;

import ejercicio1.DistanciaWebService.CalculoDistancia;

public class CorreoArgentino implements Transporte{

    public static final int COSTO_CF = 500;
    public static final int COSTO_OTRO_DESTINO = 800;

    @Override
    public double totalEnvio(String destino, double peso, CalculoDistancia distancia ) {
        double precioFinal = 0;
        if ("Capital Federal".equals(destino)) {
            precioFinal = COSTO_CF;
        }else{
            precioFinal = COSTO_OTRO_DESTINO + 5 * distancia.calcularDistancia();
        }

        return precioFinal;
    }

}
