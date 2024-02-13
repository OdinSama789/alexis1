package Ejercicio6;

import java.util.Scanner;

public class ejercicio7 {

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int combinacion = 1234; // La combinación de la caja fuerte

        System.out.println("Bienvenido a la caja fuerte");
        System.out.println("Por favor, introduzca la combinación de 4 cifras:");

        int intentos = 4;
        while (intentos > 0) {
            int intento = scanner.nextInt();
            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;
                if (intentos > 0) {
                    System.out.println("Por favor, inténtelo de nuevo. Le quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se han agotado todos los intentos. La caja fuerte permanece cerrada.");
                }
            }
        }
        scanner.close();
    }
}
}
