package ejercicio3;

public class OtroItem implements Item{
    public static final double PORCENTAJE_IMPUESTO = 0.15;
    public static final double PORCENTAJE_DESCUENTO = 0.05;
    public static final int PRECIO_MAX_ENVIO = 200;

    @Override
    public double calcularPrecio(double precio) {
        double total = precio;

        total = total * (1 + PORCENTAJE_IMPUESTO);
        if (precio > 50){
            total = total * (1 - PORCENTAJE_DESCUENTO);
        }

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
