package Ejercicios3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas a la semana: ");
        double horasTrabajadas = s.nextDouble();

        double tarifaPorHora = 70.0;
        double salarioSemanal = horasTrabajadas * tarifaPorHora;

        System.out.println("El salario semanal es: " + salarioSemanal + " soles.");
        s.close();
    }
}
