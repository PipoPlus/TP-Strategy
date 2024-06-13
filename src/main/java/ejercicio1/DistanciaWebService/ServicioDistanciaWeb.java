package ejercicio1.DistanciaWebService;

import java.util.Random;

public class ServicioDistanciaWeb implements CalculoDistancia {

    @Override
    public double calcularDistancia() {
        Random random = new Random();
        return random.nextInt(1000) + 1;

    }
}
