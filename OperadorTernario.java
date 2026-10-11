package com.taller.practico;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("¿La cookie de sesión está activa? (true/false):");
        boolean cookieSesionActiva = consola.nextBoolean();

        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";

        System.out.println("Estado de sesión: " + estadoConexion);
    }
}
