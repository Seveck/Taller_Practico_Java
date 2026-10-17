package com.educacion.ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        int partidasJugadas = 0;
        int partidasGanadas = 0;
        double mejorPuntaje = 0.0;

        final int MAX_INTENTOS = 6;
        String palabraSecreta = "JAVA";

        do {
            System.out.println("=================================");
            System.out.println("        AHORCADO DE CONSOLA      ");
            System.out.println("=================================");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Estadisticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            String entradaOpcion = consola.nextLine();
            try {
                opcion = Integer.parseInt(entradaOpcion);
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    String nombreJugador = "";
                    while (nombreJugador.length() == 0) {
                        System.out.print("Ingrese el nombre del jugador: ");
                        nombreJugador = consola.nextLine().trim().toUpperCase();
                        if (nombreJugador.length() == 0) {
                            System.out.println("Error, el nombre no puede estar vacio.");
                        }
                    }

                    int intentosRestantes = MAX_INTENTOS;
                    double puntaje = 100.0;
                    boolean juegoGanado = false;
                    int totalAciertos = 0;
                    int totalIntentos = 0;

                    StringBuilder mascara = new StringBuilder();
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        mascara.append("_ ");
                    }

                    StringBuilder letrasUsadas = new StringBuilder();

                    while (intentosRestantes > 0 && !juegoGanado) {
                        System.out.println("\nPalabra: " + mascara.toString());
                        System.out.println("Letras usadas: " + letrasUsadas.toString());
                        System.out.println("Intentos restantes: " + intentosRestantes);
                        System.out.print("Ingrese una letra: ");

                        String entradaLetra = consola.nextLine().trim().toUpperCase();

                        if (entradaLetra.length() == 0) {
                            System.out.println("Debe ingresar al menos una letra.");
                            continue;
                        }

                        char letra = entradaLetra.charAt(0);

                        if (letrasUsadas.indexOf(String.valueOf(letra)) != -1) {
                            System.out.println("Ya habias usado la letra " + letra + ", intenta con otra.");
                            continue;
                        }

                        letrasUsadas.append(letra).append(" ");
                        totalIntentos++;

                        boolean acierto = false;
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            if (String.valueOf(palabraSecreta.charAt(i)).equalsIgnoreCase(String.valueOf(letra))) {
                                mascara.setCharAt(i * 2, letra);
                                acierto = true;
                            }
                        }

                        if (acierto) {
                            totalAciertos++;
                        }

                        String mensaje = acierto ? "¡Bien hecho! Letra correcta." : "Letra incorrecta. Pierdes un intento.";
                        System.out.println(mensaje);

                        if (!acierto) {
                            intentosRestantes--;
                            puntaje = puntaje - 15.0;
                            if (puntaje < 0) {
                                puntaje = 0.0;
                            }
                        } else {
                            puntaje = puntaje + 20.0;
                        }

                        if (mascara.indexOf("_") == -1) {
                            juegoGanado = true;
                        }
                    }

                    partidasJugadas++;
                    if (juegoGanado) {
                        partidasGanadas++;
                    }
                    if (puntaje > mejorPuntaje) {
                        mejorPuntaje = puntaje;
                    }

                    double porcentajeAciertos = 0.0;
                    if (totalIntentos > 0) {
                        porcentajeAciertos = ((double) totalAciertos / totalIntentos) * 100;
                    }

                    System.out.println("\n====================================================");
                    System.out.println("RESUMEN DE LA PARTIDA");
                    System.out.println("====================================================");
                    System.out.printf("Jugador:            %s%n", nombreJugador);
                    System.out.printf("Estado Final:       %s%n", (juegoGanado ? "¡VICTORIA!" : "DERROTA"));
                    System.out.printf("Palabra Secreta:    %s%n", palabraSecreta);
                    System.out.printf("Intentos Restantes: %d / %d%n", intentosRestantes, MAX_INTENTOS);
                    System.out.printf("Porcentaje Aciertos: %.2f%%%n", porcentajeAciertos);
                    System.out.printf("Puntaje Final:      %.2f pts%n", puntaje);
                    System.out.println("====================================================\n");
                    break;

                case 2:
                    System.out.println("\n=== ESTADISTICAS DEL JUEGO ===");
                    System.out.println("Partidas jugadas: " + partidasJugadas);
                    System.out.println("Partidas ganadas: " + partidasGanadas);
                    System.out.println("Mejor puntaje: " + mejorPuntaje + " pts\n");
                    break;

                case 3:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion no valida, digite 1, 2 o 3.");
                    break;
            }

        } while (opcion != 3);
    }
}
