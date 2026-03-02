/*### Ejercicio 3 — Promedio de notas
Pide al usuario las notas de 4 asignaturas, calcula el promedio y muestra un mensaje indicando si el estudiante aprobó (promedio >= 3.0) o no.
**Datos de entrada:**
- `String` nombre
- `double` nota1, nota2, nota3, nota4

**Salida esperada:**
```
Estudiante: Carlos
Promedio  : 3.45
Estado    : APROBADO
```

> **Pista:** usa una variable `boolean aprobado = promedio >= 3.0;` para el estado.
*/

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nota de la primera asignatura: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la segunda asignatura: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la tercera asignatura: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Ingrese la nota de la cuarta asignatura: ");
        double nota4 = scanner.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        boolean aprobado = promedio >= 3.0;
        
        System.out.println("Estudiante: " + nombre);
        System.out.printf("Promedio  : " + promedio);
        System.out.println("Estado    : " + (aprobado ? "APROBADO" : "REPROBADO"));
    }
}
