package Ejercicio6;

public class ejercicio6 {
    public class Main {
        public static void main(String[] args) {
            int i = 320;
            // Utilizando un bucle do-while para imprimir los números del 320 al 160, contando de 20 en 20 hacia atrás
            do {
                System.out.println(i);
                i -= 20;
            } while (i >= 160);
        }
    }
}
