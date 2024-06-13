package ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatoLargo implements FormatoFecha{
    @Override
    public String formatearFecha(LocalDateTime fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        return fechaNacimiento.format(formatter);
    }
}
