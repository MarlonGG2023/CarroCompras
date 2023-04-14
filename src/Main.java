import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto(1,"F"," ffff", 2500, 1);
        Producto p2 = new Producto(2,"A"," aaaa", 4500, 1);
        Producto p3 = new Producto(1,"F"," ffff", 2500, 1);
        Producto p4 = new Producto(5,"B"," bbbb", 10500, 1);

        Carrito c = new Carrito();
        c.agregarProductoCarrito(p1);
        c.agregarProductoCarrito(p2);
        c.agregarProductoCarrito(p3);
        c.agregarProductoCarrito(p4);
        c.verProductoCarrito();

    }

}