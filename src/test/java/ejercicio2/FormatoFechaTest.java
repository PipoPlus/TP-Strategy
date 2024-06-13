package ejercicio2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FormatoFechaTest {


    @Test
    void testFormatoFechaLarga(){

        FormatoFecha formatoLargo = new FormatoLargo();
        LocalDateTime fechaNacimiento = LocalDateTime.of(1986, 6, 3, 0, 0);
        var persona = new Persona(fechaNacimiento, formatoLargo);

        String fechaFormateada = persona.darFecha();

        assertEquals(fechaFormateada,"3 de junio de 1986");

    }


    @Test
    void testFormatoFechaCorta(){

        FormatoFecha formatoCorto = new FormatoCorto();
        LocalDateTime fechaNacimiento = LocalDateTime.of(1986, 6, 3, 0, 0);
        var persona = new Persona(fechaNacimiento, formatoCorto);

        String fechaFormateada = persona.darFecha();

        assertEquals(fechaFormateada,"3-06-1986");

    }


    @Test
    void testCambiarFormatoFecha(){

        FormatoFecha formatoCorto = new FormatoCorto();
        LocalDateTime fechaNacimiento = LocalDateTime.of(1986, 6, 3, 0, 0);
        var persona = new Persona(fechaNacimiento, formatoCorto);

        String fechaFormateada = persona.darFecha();
//        System.out.println("Formato Corto: " + fechaFormateada);

        FormatoFecha formatoLargo = new FormatoLargo();
        persona.setFormatoFecha(formatoLargo);

        fechaFormateada = persona.darFecha();
//        System.out.println("Formato Largo: " + fechaFormateada);

        assertEquals(fechaFormateada,"3 de junio de 1986");

    }


}