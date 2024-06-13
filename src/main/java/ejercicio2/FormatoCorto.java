package ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements FormatoFecha{
    @Override
    public String formatearFecha(LocalDateTime fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
        return fechaNacimiento.format(formatter);
    }
}
