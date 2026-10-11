package com.taller.practico;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double precioBase = 100.0;

        System.out.println("Ingrese el tipo de entrada (VIP, ESTUDIANTE, GENERAL, ADULTO_MAYOR):");
        String tipoEntrada = consola.next();

        if (tipoEntrada.equalsIgnoreCase("VIP")) {
            double recargo = precioBase * 0.10;
            double precioFinal = precioBase + recargo;
            System.out.println("Tipo de entrada: VIP");
            System.out.println("Monto final a pagar: $" + precioFinal);
        } else if (tipoEntrada.equalsIgnoreCase("ESTUDIANTE")) {
            double descuento = precioBase * 0.50;
            double precioFinal = precioBase - descuento;
            System.out.println("Tipo de entrada: ESTUDIANTE");
            System.out.println("Monto final a pagar: $" + precioFinal);
        } else if (tipoEntrada.equalsIgnoreCase("ADULTO_MAYOR")) {
            double descuento = precioBase * 0.40;
            double precioFinal = precioBase - descuento;
            System.out.println("Tipo de entrada: ADULTO_MAYOR");
            System.out.println("Monto final a pagar: $" + precioFinal);
        } else if (tipoEntrada.equalsIgnoreCase("GENERAL")) {
            System.out.println("Tipo de entrada: GENERAL");
            System.out.println("Monto final a pagar: $" + precioBase);
        } else {
            System.out.println("Tipo de entrada no reconocido");
        }
    }
}
