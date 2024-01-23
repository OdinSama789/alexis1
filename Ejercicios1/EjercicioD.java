package Ejercicios1;

public class EjercicioD {
    public static void main(String[] args) {
        // Declaración de variables
        double soles;
        double tipoCambio;
        double euros;
        // Asignación de valores
        soles = 100.0; // Puedes cambiar este valor por la cantidad en soles que quieras convertir
        tipoCambio = 0.12; // Puedes cambiar este valor por el tipo de cambio actual
          // Cálculo de la conversión a euros
          euros = soles * tipoCambio;
            // Mostrar el resultado por pantalla
        System.out.println("Cantidad en soles: " + soles);
        System.out.println("Tipo de cambio: " + tipoCambio);
        System.out.println("Equivalente en euros: " + euros);
    }
}
