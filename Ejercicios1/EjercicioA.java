package Ejercicios1;

public class EjercicioA {
    public static void main(String[] args) {
        // Declaramos las variables enteras x e y
        int x = 144;
        int y = 999;

        // Mostramos por pantalla el valor de cada variable
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);

        // Realizamos las operaciones y mostramos los resultados
        int suma = x + y;
        int resta = x - y;
        
        // Nota: Para la división y la multiplicación, usamos datos de tipo double para manejar resultados con decimales
        double division = (double) x / y;
        int multiplicacion = x * y;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}
    
