/*  ### Ejercicio 4 — Perfil de usuario
Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo y si acepta términos y condiciones.
Muestra un resumen indicando el tipo de dato que se usó para cada campo.

**Datos de entrada:** `String`, `int`, `String`, `String`, `boolean`

**Salida esperada:**
```
========= Perfil creado =========
Nombre  (String)  : Ana Pérez
Edad    (int)     : 22
Ciudad  (String)  : Bogotá
Correo  (String)  : ana@mail.com
T&C     (boolean) : true */

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.print("¿Acepta términos y condiciones? 1(si) 2(no): ");
        boolean acepta = scanner.nextInt() == 1;

        System.out.println("========= Perfil creado =========");
        System.out.println("Nombre    : " + nombre);
        System.out.println("Edad      : " + edad);
        System.out.println("Ciudad    : " + ciudad);
        System.out.println("Correo    : " + correo);
        System.out.println("T&C       : " + (acepta ? "Sí" : "No"));
    }
}
