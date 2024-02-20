package EXP1GiovanniAlexisAguirreDavalos;

    import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int introducciones = 0; // Contador de introducciones
        int maxRepeticiones = 0;// Contador de repeticiones máximas
        int numeroRepetido = 0;// Número que se repite
        int repeticionesActuales = 0;// Contador de repeticiones actuales
        int numero;
        
        System.out.println("Introduce números (introduce 0 para finalizar):");
        
        do {
            numero = scanner.nextInt();
            
            if (numero != 0) {
                introducciones++;
                
                if (numero == numeroRepetido) {
                    repeticionesActuales++;
                } else {
                    repeticionesActuales = 1;
                    numeroRepetido = numero;
                }
                
                if (repeticionesActuales > maxRepeticiones) {
                    maxRepeticiones = repeticionesActuales;
                }
            }
        } while (numero != 0);
        
        System.out.println("El número más repetido es el " + numeroRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        System.out.println("Se han realizado " + introducciones + " introducciones.");
        
        scanner.close();
    }
}

