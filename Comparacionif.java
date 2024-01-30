public class Comparacionif {
    public static void main(String[] args) {
        /*semtecia condicional, permitir al programa bifurcar
         * el flujo de la ejecuci+on del programa dependiendo
         * de una concdicion (verdad o falso).
         * 
         * sentencia if
         * 
         * if(condicion){
         *    instrucciones a ejecutar si la condicion es verdadera
         * }else{
         *    instrucciones a ejecutar si la condicion es falsa
         * }
         */
    
    String miFruta = "naranja";
    if (miFruta == "platano") {
        System.out.println("Que ricca fruta. me la como!!!");
        
    } else {
        System.out.println("No puedo comer esa fruta!!!");
        
    }

    //Programa que indique cual es la capital del Pe+u

    String capital = "Arequipa";
    if (capital== "lima")  {
        System.out.println("Es correcto, "+capital+"es la capital de Perú!!!");
        
    } else {
        System.out.println("No!!!, "+capital+" no es capital de Perú");
        
    }


}
}
