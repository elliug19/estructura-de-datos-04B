//Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

//El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.
public class ejercicio2 {
   
public static void main(String[] args) {
        int[] cedulas = new int[1000];
        int base = 10000000;
        for (int i = 0; i < cedulas.length; i++) {
            cedulas[i] = base + i;
        }

        int cedulaBuscada = 10000437;
        int indice = buscarRec(cedulas, cedulaBuscada);

        if (indice != -1) {
            System.out.println("Cliente con cédula " + cedulaBuscada +
                               " encontrado en índice " + indice +
                               " (posición " + (indice + 1) + ").");
        } else {
            System.out.println("Cliente NO encontrado.");
        }
        }

private static int buscarRec(int[] cedulas, int cedulaBuscada) {

    throw new UnsupportedOperationException("Unimplemented method 'buscarRec'");
}
    }

