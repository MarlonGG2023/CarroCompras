import java.util.ArrayList;

public class Carrito {
    private int cont;
    private  int total;
    private Producto producto;
    private ArrayList <Producto> carroC;

    public Carrito(){
        carroC = new ArrayList<Producto>();
    }

    public int getCont() {
        return cont++;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void agregarProductoCarrito(Producto p){
        for (int i = 0; i <= carroC.size();  i++){
                carroC.add(p);
                System.out.println("Se ha agregado al carrito.");
                getCont();
                break;
        }
            /*else{
                if (carroC.get(i).getIdProducto() == p.getIdProducto()){
                    //carroC.get(i).getCantidad() += p.getCantidad();
                    System.out.println("Prueba");
                }
            }*/
    }

    public void eliminarProductoCarrito(){

    }

    public void totalCarrito(){
    }

    public void verProductoCarrito(){
       /*for (int i = 1; i <= carroC.size(); i++){
            //System.out.println(carroC.get(i).toString());
        }*/
        System.out.println("Cantidad de productos: " + carroC.size());
        System.out.println();
    }

}
