package ejercicio2;

import java.time.LocalDateTime;

public class Persona {

    LocalDateTime fechaNacimiento;
    FormatoFecha formatoFecha;

    public Persona(LocalDateTime fechaNacimiento, FormatoFecha formatoFecha){
        this.fechaNacimiento = fechaNacimiento;
        this.formatoFecha = formatoFecha;
    }

    public void setFormatoFecha(FormatoFecha formatoFecha){
        this.formatoFecha = formatoFecha;
    }

    public String darFecha(){
        return formatoFecha.formatearFecha(fechaNacimiento);
    }

}
