package Seccion_4;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i % 2 != 0 || i % 5 == 0) {
                continue;
            } else {
                System.out.println("Numero par no multiplo de 5: " + i);
            }
        }
    }
}
