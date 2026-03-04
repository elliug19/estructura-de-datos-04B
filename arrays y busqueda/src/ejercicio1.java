 /*Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico. */
public class ejercicio1 {
    public static int buscar(int[] lista, int objetivo) {
        
for (int i = 0; i < lista.length; i++) {
            if (lista[i] == objetivo) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] estanteria = {560210, 770123, 112233, 778899, 770120, 330045};
        int codigoEscaneado = 770123;
        int pos = buscar(estanteria, codigoEscaneado);

        if (pos != -1)
            System.out.println("Encontrado en índice " + pos + " (posición " + (pos + 1) + ").");
        else
            System.out.println("Producto no disponible en esta estantería.");

        
        

        
        
    }
}
