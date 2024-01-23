package Ejercicios1;

public class Variables {
    public static void main(String[] args) {
        // Variables
        /*
         * Nombre de las variables, siemrpe empezar con una letra
         * la nomenclatura lowerCamelCase, ejemplos:
         * volumen
         * volumenCilindro
         * edadMinima / edadMin
         * edad_minima
         * e1a1_23
         */
        /*
         * Tipos de dato
         * Entero(int y long)
         */
        byte edad; // declara una variable de nombre edad y tipo de dato entero
        edad = 20; // asignamos el valor de 20 a la variable edad
        System.out.println(edad);

        edad = 56;
        System.out.println("y ahora es " + edad);

        // Numeros decimales (doble y float)
        double x, y;

        x = 7;
        y = 25.01;

        System.out.println(x);
        System.out.println(y);

        /*
         * Cadena de catacteres (String)
         */
        String miPalabra = "Cerveza";
        String miFrase = "¿Quién se tomo mi cerveza?";
        System.out.println("Una palabra que uso frecuentemente es: " + miPalabra);
        System.out.println("Una frase que uso a veces es: " + miFrase);

        String cadenaInicial = "";

        /*
         * Caracteres (char)
         */
        char letra1 = 'c';
        char letra2 = 'a';
        char letra3 = 's';
        char letra4 = 'a';

        System.out.println(letra1+""+letra2+""+letra3+""+letra4);

    }
}

