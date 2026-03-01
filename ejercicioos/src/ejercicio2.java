public class ejercicio2 {
    public static void main(String[] args) {
        double cafe = 5000;
        int cantidad = 6;
        double descuento = 0.14;
        double tot = cafe *cantidad;
        double tode = tot * descuento;


        System.out.println("Producto vendido: Café");
        System.out.println("Precio del producto: " + cafe);
        System.out.println("Cantidad del producto: " + cantidad);
        System.out.println("Total con descuento: " + tode);

    }
}
