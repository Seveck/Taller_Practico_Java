package Seccion_3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        int numero = 0;
        long factorial = 1;
        Scanner consola = new Scanner(System.in);

        System.out.println("Digite un numero");
        numero = consola.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es: " + factorial);

        System.out.println("Patron:");
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
