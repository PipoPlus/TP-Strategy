package ejercicio3;


class Producto {
    public Item tipo;
    public double precio;

    public Producto(Item tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public void cambiarProducto(Item tipo){
        this.tipo = tipo;
    }

    public double precioFinal() {
        return tipo.calcularPrecio(precio);
    }
}

