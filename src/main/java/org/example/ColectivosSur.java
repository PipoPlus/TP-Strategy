package org.example;

public class ColectivosSur implements Transporte{


    public static final int COSTO_CAPITAL_FEDERAL = 1000;
    public static final int COSTO_GRAN_BSAS = 1500;
    public static final int COSTO_OTROS_DESTINOS = 3000;
    public static final int PESO_MINIMO = 5;

    @Override
    public double totalEnvio(String destino, double peso) {
        double precioFinal;

        if ("Capital Federal".equals(destino)){
            precioFinal = COSTO_CAPITAL_FEDERAL;
        }else if ("Gran Buenos Aires".equals(destino)){
            precioFinal = COSTO_GRAN_BSAS;
        }else {
            precioFinal = COSTO_OTROS_DESTINOS;
        }

        if (peso >= PESO_MINIMO && peso <= 30){
            precioFinal += 500;
        } else if (peso > 30) {

            precioFinal += 2000;
        }

        return 0;
    }
}
