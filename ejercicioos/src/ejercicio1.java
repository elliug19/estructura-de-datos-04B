/*Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código
(número entero), semestre actual, promedio acumulado y si está matriculado o no.
Declara las variables con los tipos de datos apropiados.
Asigna valores de ejemplo.
Imprima un informe por consola con el siguiente formato:
=== Ficha del Estudiante ===
Nombre: Ana Torres
Código: 20241001
Semestre: 3
Promedio: 3.85
Matriculado: true */
public class ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Luis Ortega";
        int codigo = 33445566;
        int semestre = 5;
        float promedio = 3.7f;
        boolean matriculado = true;

        System.out.println("Nombre del estudiantado: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);

    }
}