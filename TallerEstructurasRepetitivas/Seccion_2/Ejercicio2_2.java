package Seccion_2;

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int saldo = 0;
        int opcion = 0;

        do {
            System.out.println("1. Consular saldo");
            System.out.println("2. Realizar deposito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Salir del sistema");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Su saldo es de: %d \n", saldo);
                    break;
                case 2:
                    System.out.println("De cuanto es el deposito que desea hacer?");
                    int deposito = consola.nextInt();

                    if (deposito < 0) {
                        System.out.println("Error, valor no valido");
                        break;
                    } else {
                        saldo += deposito;
                        System.out.println("Deposito exitoso!");
                        break;
                    }
                case 3:
                    System.out.println("De cuanto es el retiro que desea hacer?");
                    int retiro = consola.nextInt();

                    if(retiro <= 0 || saldo <= 0) {
                        System.out.println("Error, valor no valido o saldo insuficiente");
                        break;
                    } else {
                        System.out.println("Retiro exitoso!");
                        saldo -= retiro;
                        break;
                    }
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error, opcion invalida");
            }
        } while (opcion != 4);
    }
}
