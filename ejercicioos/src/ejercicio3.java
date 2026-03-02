/*Un sensor industrial registra temperaturas. El sistema recibe:

Temperatura actual en Celsius ( double)
Nombre del sensor ( String)
Número de lectura ( int)
Si la temperatura supera el límite de 80°C, debe ser una boolean llamada variable en Alarmatrue
Imprime el estado del sensor con todos sus datos.

 */
public class ejercicio3 {
    public static void main(String[] args) {
        double tempcel = 121.0;
        String sensor = "Tracamatraca";
         int lect = 17;
        
        boolean enAlarma = tempcel > 80.0;
        System.out.println("Temperatura en celcius  " + tempcel);
        System.out.println("Nombre del sensor: " + sensor);
        System.out.println("Lectura del sensor: " + lect);
        if (enAlarma){
            System.out.println("La temperatura del sensor: " + tempcel + ", supera los limites"); 
        }
        else{
            System.out.println("La temperatura del sensor: " + tempcel + ", esta dentro de los limites"); 
        }
    }
}
