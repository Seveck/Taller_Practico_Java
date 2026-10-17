package Seccion_5;

import java.util.Scanner;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        int opcion = 0;
        int stockTotal = 0;
        int stockMaximo = 500;
        float precioTotal = 0f;

        Scanner consola = new Scanner(System.in);

        do {
            System.out.println("1. Registrar Lote de Productos");
            System.out.println("2. Ver Estado del Almacén");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite la cantidad de productos a registrar en este lote:");
                    int productos = consola.nextInt();

                    if (productos <= 0) {
                        System.out.println("Error, cantidad de productos inválida.");
                        break;
                    }

                    for (int i = 1; i <= productos; i++) {
                        System.out.println("--- Producto " + i + " ---");

                        System.out.println("¿El producto está descontinuado? (1 = Sí / 2 = No)");
                        int descontinuado = consola.nextInt();
                        if (descontinuado == 1) {
                            System.out.println("Producto descontinuado, se omite.");
                            continue;
                        }

                        System.out.println("Digite el precio del producto:");
                        float precio = consola.nextFloat();
                        while (precio <= 0) {
                            System.out.println("Error, el precio debe ser mayor a 0. Digítelo de nuevo:");
                            precio = consola.nextFloat();
                        }

                        System.out.println("Digite el stock del producto:");
                        int stock = consola.nextInt();
                        while (stock <= 0) {
                            System.out.println("Error, el stock debe ser mayor a 0. Digítelo de nuevo:");
                            stock = consola.nextInt();
                        }

                        if (stockTotal + stock > stockMaximo) {
                            System.out.println("Alerta, supera la capacidad máxima del almacén.");
                            System.out.println("Se interrumpe el registro del lote.");
                            break;
                        }

                        stockTotal = stockTotal + stock;
                        precioTotal = precioTotal + (precio * stock);
                        System.out.println("Producto registrado con éxito.");
                    }
                    break;

                case 2:
                    System.out.println("=== ESTADO DEL ALMACÉN ===");
                    System.out.println("Unidades en inventario: " + stockTotal + " / " + stockMaximo);
                    System.out.println("Valor total del inventario: " + precioTotal);

                    if (stockTotal >= stockMaximo) {
                        System.out.println("Capacidad máxima alcanzada.");
                    } else {
                        System.out.println("Capacidad disponible.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error, opción inválida.");
            }

        } while (opcion != 3);

        consola.close();
    }
}