package Ejercicio6;

import java.util.Scanner;

public class ejercicio11 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar si el número es primo
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}
}
