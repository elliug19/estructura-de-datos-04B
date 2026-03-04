
/*Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.*/
public class ejercicio3 {
    
public static int indiceDelMaximo(double[] temperaturas) {
        if (temperaturas == null || temperaturas.length == 0) {
            throw new IllegalArgumentException("El arreglo de temperaturas está vacío");
        }
        int idx = 0;
        double max = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > max) {
                max = temperaturas[i];
                idx = i;
            }
        }
        return idx;

    }
    public static void main(String[] args) {
        double[] temperaturas = {72.5, 73.1, 74.0, 73.8, 75.2, 74.9, 75.2, 74.4, 73.9, 72.8, 71.5, 70.9};
        
        double maxs = maximoLineal(temperaturas);
        System.out.println("La temperatura maxima es: "  + maxs + " °C");

    }
    private static double maximoLineal(double[] temperaturas) {
        
        throw new UnsupportedOperationException("Unimplemented method 'maximoLineal'");
    }
}
