package Ejercicio6;

public class ejercicio3 {
    public class Main {
        public static void main(String[] args) {
            int i = 0;
            // Utilizando un bucle do-while para imprimir los múltiplos de 5 en el rango de 0 a 100
            do {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= 100);
        }
    }
}
