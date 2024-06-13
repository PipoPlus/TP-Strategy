package ejercicio3;

public class Libro implements Item{

    public static final double PORCENTAJE_IMPUESTO = 0.1;
    public static final double PORCENTAJE_DESCUENTO = 0.1;
    public static final int PRECIO_MAX_ENVIO = 100;

    @Override
    public double calcularPrecio(double precio) {
        double total = precio;

        total = total * (1 + PORCENTAJE_IMPUESTO) * (1 - PORCENTAJE_DESCUENTO);
        total -= valorDeEnvio(precio);

        return total;
    }

    private double valorDeEnvio(double precio) {
        if (precio > PRECIO_MAX_ENVIO) {
            return  10;
        }
        return 0;
    }
}
