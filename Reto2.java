package com.taller.practico;

import java.util.Locale;
import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ingrese la calificación final (0.0 a 100.0):");
        double calificacionFinal = consola.nextDouble();

        System.out.println("Ingrese el porcentaje de asistencia (0 a 100):");
        int porcentajeAsistencia = consola.nextInt();

        System.out.println("¿Entregó el proyecto final? (true/false):");
        boolean entregoProyectoFinal = consola.nextBoolean();

        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            System.out.println("Dictamen: Aprobado");
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            System.out.println("Dictamen: Pendiente de Examen Extraordinario");
        } else {
            System.out.println("Dictamen: Reprobado");
        }
    }
}
