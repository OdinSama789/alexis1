package EXP1GiovanniAlexisAguirreDavalos;

    import java.util.Scanner;

public class pregunta1{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número inicial: 1 ");
        int inicio = Scanner.nextInt();
        
        System.out.print("Ingrese el número final: 1000 ");
        int fin = Scanner.nextInt();
        
        System.out.print("Ingrese el tamaño del grupo: 20 ");
        int tamanoGrupo = Scanner.nextInt();
        
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i + " ");
            contador++;
            
            if (contador == tamanoGrupo) {
                System.out.println();
                contador = 0;
                
                System.out.print("¿Desea continuar visualizando el siguiente grupo de números? (s/n): ");
                String respuesta = Scanner.next();
                
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            }
        }
    }
}

