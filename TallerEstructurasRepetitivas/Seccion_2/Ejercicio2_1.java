package Seccion_2;

import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        int intentoPin = 0;
        Scanner consola = new Scanner(System.in);

        do {
            System.out.println("Digite su pin");
            intentoPin = consola.nextInt();

            if (intentoPin < 1000 || intentoPin > 9999) {
                System.out.println("Error: La clave debe tener exactamente 4 dígitos positivos");
            } else {
                System.out.println("Pin ingresado!");
            }
        } while (intentoPin < 1000 || intentoPin > 9999);
    }
}
