package EXP1GiovanniAlexisAguirreDavalos;

    import java.util.Scanner;

public class pregunta5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        // Declarar variables para contar los números positivos y negativos
        int positivos = 0;
        int negativos = 0;
        
        // Leer los diez números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = Scanner.nextInt();
            
            // Verificar si el número es positivo o negativo
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        // Mostrar los resultados por pantalla
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}