/*Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código
está en la lista de "pagos al día". Si no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.*/
import java.util.Scanner;
public class ejercicio4 {
    public static boolean validarAcceso(int[] lista, int codigo) {
        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (lista[medio] == codigo) {
                return true; 
            }

            if (codigo < lista[medio]) {
                fin = medio - 1; 
            } else {
                inicio = medio + 1;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        
        int[] codigosPagados = {101, 205, 310, 412, 578, 690};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite su código de acceso: ");
        int codigoIngresado = sc.nextInt();

        if (validarAcceso(codigosPagados, codigoIngresado)) {
            System.out.println(" Acceso permitido. Bienvenido al gimnasio.");
        } else {
            System.out.println(" Acceso denegado. Mensualidad pendiente.");
        }

        sc.close();
    }
}

