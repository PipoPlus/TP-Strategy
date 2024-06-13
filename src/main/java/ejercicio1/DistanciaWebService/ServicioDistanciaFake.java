package ejercicio1.DistanciaWebService;

public class ServicioDistanciaFake implements CalculoDistancia{

    @Override
    public double calcularDistancia() {
        return 10;
    }
}
