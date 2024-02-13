package Ejercicio6;

import java.util.Scanner;

public class ejercicio13 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primerNumero, segundoNumero;

        // Solicitar al usuario que ingrese dos números distintos
        do {
            System.out.print("Ingrese el primer número entero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero.");
                System.out.print("Ingrese el primer número entero: ");
                scanner.next();
            }
            primerNumero = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero (distinto al primero): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero.");
                System.out.print("Ingrese el segundo número entero (distinto al primero): ");
                scanner.next();
            }
            segundoNumero = scanner.nextInt();

            if (primerNumero == segundoNumero) {
                System.out.println("Los números deben ser distintos. Por favor, intente de nuevo.");
            }
        } while (primerNumero == segundoNumero);

        // Ordenar los números ingresados
        int menorNumero = Math.min(primerNumero, segundoNumero);
        int mayorNumero = Math.max(primerNumero, segundoNumero);

        // Mostrar los números enteros comprendidos e incrementados de 7 en 7
        System.out.println("Números enteros comprendidos entre " + menorNumero + " y " + mayorNumero + ", incrementando de 7 en 7:");
        for (int i = menorNumero; i <= mayorNumero; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
}
