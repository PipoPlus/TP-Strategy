package ejercicio1;

import ejercicio1.DistanciaWebService.ServicioDistanciaFake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioTest {

    @Test
    void testCalcularEnvioColectivosSur(){
        var colectivosSur = new ColectivosSur();
        var envio = new Envio(colectivosSur);
        var distanciaFake = new ServicioDistanciaFake();

        assertEquals(envio.calcularEnvio("Capital Federal",10,distanciaFake), 1500.0);
    }

    @Test
    void testCalcularEnvioCorreoArgentino(){
        var correoArgentino = new CorreoArgentino();
        var envio = new Envio(correoArgentino);
        var distanciaFake = new ServicioDistanciaFake();

        assertEquals(envio.calcularEnvio("Viedma",10,distanciaFake), 850.0);
    }

    @Test
    void testCambioDeTransporte(){
        var correoArgentino = new CorreoArgentino();
        var envio = new Envio(correoArgentino);
        var distanciaFake = new ServicioDistanciaFake();

        double precioEnvio = envio.calcularEnvio("Viedma",10,distanciaFake);
//        System.out.println("Costo de envio por Correo Argentino: " + precioEnvio);

        envio.cambiarTransporte(new ColectivosSur());
        precioEnvio = envio.calcularEnvio("Viedma",10,distanciaFake);
//        System.out.println("Costo de envio por Colectivos Sur: " + precioEnvio);

        assertEquals(precioEnvio, 3500.0);
    }


}