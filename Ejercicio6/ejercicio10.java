package Ejercicio6;

import java.util.Scanner;

public class ejercicio10 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosPositivos = 0;
        int numerosNegativos = 0;

        System.out.println("Ingrese diez números:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);

        scanner.close();
    }
}
}
