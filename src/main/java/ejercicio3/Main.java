package ejercicio3;

public class Main {
    public static void main(String[] args) {

        var t1 = new Libro();
        var t2 = new Alimento();
        var t3 = new Medicina();
        var t4 = new OtroItem();


        var p1 = new Producto(t1, 30);
        var p2 = new Producto(t2, 330);
        var p3 = new Producto(t3, 130);
        var p4 = new Producto(t4, 130);
        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}
