package Seccion_1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        int numUsuario = 0;
        int contador = 0;
        int numeroFinal = 0;
        int numCentinela = -99;
        Scanner consola = new Scanner(System.in);

        while(numCentinela != numUsuario) {
            System.out.println("Digite un numero entero");
            numUsuario = consola.nextInt();

            if (numCentinela != numUsuario) {
                contador++;
                numeroFinal = numUsuario + numeroFinal;
            }

        }
        System.out.println("La suma de sus numeros es: " + numeroFinal);
        System.out.printf("Entro %d veces", contador);
    }
}
