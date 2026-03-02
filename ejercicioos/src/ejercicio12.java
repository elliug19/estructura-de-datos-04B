/*### Ejercicio 2 — Conversor de temperatura
Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

**Fórmulas:**
- `F = (C × 9/5) + 32`
- `K = C + 273.15`

**Dato de entrada:** `double` temperatura en Celsius

**Salida esperada:**
```
25.0 °C = 77.0 °F = 298.15 K */

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf( celsius + " °C = " + fahrenheit + " °F = " + kelvin + " K");
    }
}
