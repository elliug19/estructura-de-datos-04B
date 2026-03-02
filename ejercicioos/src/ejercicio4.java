
/*El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

Placa ( String)
Año de fabricación ( int)
Cilindraje en cc ( int)
Precio de compra ( double)
Inicial del color ( char)
Si tiene SOAT vigente ( boolean)
Muestra todos los datos en consola. */public class ejercicio4 {
    public static void main(String[] args) {
        String placa = "1234-0109";
        int añoFabricacion = 2009;
         int CilCC = 400;
        double precomp = 45000.50;
        char incol = 'A';
        boolean sovin = true;
        
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + añoFabricacion);
        System.out.println("Cilindraje en cc: " + CilCC);
        System.out.println("Precio de compra: " + precomp);
        System.out.println("Inicial del color: " + incol);
        System.out.println("Tiene SOAT vigente: " + sovin);
    }
}
