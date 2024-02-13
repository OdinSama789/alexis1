package Ejercicio6;

import java.util.Scanner;

public class ejercicio9 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número inicial
        System.out.print("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        // Mostrar encabezado de las columnas
        System.out.println("Número\tCuadrado\tCubo");

        // Calcular y mostrar los cuadrados y cubos de los 5 primeros números a partir del ingresado
        for (int i = 0; i < 5; i++) {
            int numeroActual = primerNumero + i;
            int cuadrado = numeroActual * numeroActual;
            int cubo = numeroActual * numeroActual * numeroActual;
            System.out.println(numeroActual + "\t" + cuadrado + "\t\t" + cubo);
        }

        scanner.close();
    }
}
}
