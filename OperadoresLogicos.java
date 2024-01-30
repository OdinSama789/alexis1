public class OperadoresLogicos {
    public static void main(String[] args) {
        /*Operadores Lógicos
         * 
         * &&  Y   (a>b) && (a>c)
         * ||  O   (a>b) || (a>c)
         * !   no  !(a>b)
         */

         int numero = 35;
         if ((numero > 1) && (numero < 100)) {
            System.out.println("El numero ingresado esta entre 1 y 100");
            
         } else {
            System.out.println("El numero no esta entre 1 y 100");+
         }
    }
    
}
