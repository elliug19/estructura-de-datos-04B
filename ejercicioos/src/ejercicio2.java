/*Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

Precio unitario de un producto ( double)
Cantidad comprada ( int)
Descuento aplicado en porcentaje ( double)
Total a pagar después del descuento
Declara las variables, realiza el cálculo y muestra el resultado por consola. */
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
