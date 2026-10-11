package com.taller.practico;

import java.util.Scanner;

public class GestionSemanaSwitch {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un número de día (1 al 7):");
        int dia = consola.nextInt();

        System.out.println("--- Implementación 1 (Switch Tradicional) ---");
        switch (dia) {
            case 1:
                System.out.println("Lunes (Jornada Laboral)");
                break;
            case 2:
                System.out.println("Martes (Jornada Laboral)");
                break;
            case 3:
                System.out.println("Miércoles (Jornada Laboral)");
                break;
            case 4:
                System.out.println("Jueves (Jornada Laboral)");
                break;
            case 5:
                System.out.println("Viernes (Jornada Laboral)");
                break;
            case 6:
                System.out.println("Sábado (Fin de Semana)");
                break;
            case 7:
                System.out.println("Domingo (Fin de Semana)");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

        System.out.println("--- Implementación 2 (Switch Moderno) ---");
        String resultado = switch (dia) {
            case 1 -> "Lunes (Jornada Laboral)";
            case 2 -> "Martes (Jornada Laboral)";
            case 3 -> "Miércoles (Jornada Laboral)";
            case 4 -> "Jueves (Jornada Laboral)";
            case 5 -> "Viernes (Jornada Laboral)";
            case 6 -> "Sábado (Fin de Semana)";
            case 7 -> "Domingo (Fin de Semana)";
            default -> "Día no válido";
        };
        System.out.println(resultado);
    }
}
