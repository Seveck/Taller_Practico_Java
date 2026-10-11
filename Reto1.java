package com.taller.practico;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese la edad del usuario:");
        int edadUsuario = consola.nextInt();

        if (edadUsuario < 12) {
            System.out.println("Categoría: Infante");
            System.out.println("Permiso: Requiere tutor de cuenta");
        } else if (edadUsuario >= 12 && edadUsuario <= 17) {
            System.out.println("Categoría: Adolescente");
            System.out.println("Permiso: Acceso restringido a foros comunitarios");
        } else if (edadUsuario >= 18 && edadUsuario <= 64) {
            System.out.println("Categoría: Adulto");
            System.out.println("Permiso: Acceso a funcionalidades estándar");
        } else {
            System.out.println("Categoría: Adulto Mayor");
            System.out.println("Permiso: Acceso con interfaz adaptada");
        }
    }
}
