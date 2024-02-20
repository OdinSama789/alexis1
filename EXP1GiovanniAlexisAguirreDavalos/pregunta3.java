package EXP1GiovanniAlexisAguirreDavalos;

    import java.util.Scanner;

public class pregunta3{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        // Solicitar al usuario la altura h en metros
        System.out.print("Ingrese la altura en metros: ");
        double altura = Scanner.nextDouble();
        
        // Calcular el tiempo de caída utilizando la fórmula
        double tiempo = Math.sqrt((2 * altura) / 9.81);
        
        // Mostrar el resultado por pantalla
        System.out.println("El tiempo de caída es: " + tiempo + " segundos");
    }
}


