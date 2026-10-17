package Seccion_3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner consola = new Scanner(System.in);

        System.out.println("Digite un numero");
        numero = consola.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + "X" + i + "=" + (numero * i));
        }

        System.out.println("Conteo regresivo:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
