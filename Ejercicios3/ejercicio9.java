package Ejercicios3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la nota del primer examen y la media deseada
        System.out.print("Ingrese la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("Ingrese la media deseada: ");
        double mediaDeseada = scanner.nextDouble();

        // Calcular la nota necesaria en el segundo examen
        // La fórmula es: notaNecesaria = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;
        double notaNecesaria = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        // Mostrar la nota necesaria en el segundo examen
        System.out.printf("Para alcanzar una media de %.2f, necesitas sacar %.2f en el segundo examen.%n", mediaDeseada, notaNecesaria);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
