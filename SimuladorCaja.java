package com.taller.practico;

import java.util.Scanner;

public class SimuladorCaja {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de licencias:");
        int cantidad = consola.nextInt();

        System.out.println("Ingrese el tipo de cliente (VIP, REGULAR, NUEVO):");
        String tipoCliente = consola.next();

        consola.nextLine();
        System.out.println("Ingrese el cupón promocional:");
        String cupon = consola.nextLine();

        double subtotalBase = cantidad * 250.00;

        double porcentajeDescuento = 0.0;
        switch (tipoCliente.toUpperCase()) {
            case "VIP":
                porcentajeDescuento = 0.20;
                break;
            case "REGULAR":
                porcentajeDescuento = 0.10;
                break;
            case "NUEVO":
                porcentajeDescuento = 0.05;
                break;
            default:
                porcentajeDescuento = 0.0;
                break;
        }

        double descuentoCliente = subtotalBase * porcentajeDescuento;
        double subtotalConDescuento = subtotalBase - descuentoCliente;

        double descuentoCupon = 0.0;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        }

        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double totalFinal = baseImponible + iva;

        System.out.println("Subtotal Base: $" + subtotalBase);
        System.out.println("Descuento Cliente: -$" + descuentoCliente);
        System.out.println("Subtotal con Descuento: $" + subtotalConDescuento);
        System.out.println("Descuento Cupón: -$" + descuentoCupon);
        System.out.println("Base Imponible: $" + baseImponible);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Total a pagar = $" + totalFinal);
    }
}
