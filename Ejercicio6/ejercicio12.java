package Ejercicio6;

import java.util.Scanner;

public class ejercicio12 {
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;

        // Solicitar al usuario que ingrese un número entero positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero positivo válido.");
                System.out.print("Ingrese un número entero positivo: ");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

        // Sumar los 100 números siguientes al número ingresado
        for (int i = numero + 1; i <= numero + 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);

        scanner.close();
    }
}
}
