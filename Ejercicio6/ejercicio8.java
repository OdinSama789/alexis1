package Ejercicio6;

import java.util.Scanner;

public class ejercicio8 {
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        long numero = scanner.nextLong();

        int cantidadDigitos = 0;
        long numeroAbsoluto = Math.abs(numero);

        // Si el número es 0, entonces tiene un solo dígito
        if (numero == 0) {
            cantidadDigitos = 1;
        } else {
            while (numeroAbsoluto > 0) {
                cantidadDigitos++;
                numeroAbsoluto /= 10;
            }
        }

        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");
        scanner.close();
    }
}
}
