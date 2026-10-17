package Seccion_1;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        boolean procesado = true;
        int monto = 0;
        int acumulador = 0;
        Scanner consola = new Scanner(System.in);

        while(procesado) {
            System.out.println("Digite su monto");
            monto = consola.nextInt();

            if(monto < 0) {
                procesado = false;
            } else if (monto == 0) {
                System.out.println("Digite un numero mayor a 0");
            } else if (monto > 0){
                System.out.println("Transaccion exitosa!");
                acumulador += monto;
                if (acumulador >= 1000000) {
                    procesado = false;
                }
            }
        }

        if (monto < 0) {
            System.out.println("Saldo final acumulado: " + acumulador);
            System.out.println("Razon de cierre: Monto negativo");
        } else if (acumulador >= 1000000) {
            System.out.println("Saldo final acumulado: " + acumulador);
            System.out.println("Razon de cierre: El saldo final alcanzado");
        }
    }
}
