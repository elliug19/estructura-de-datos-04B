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
