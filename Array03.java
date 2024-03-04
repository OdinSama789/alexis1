public class Array03 {
    public static void main(String[] args) {
        //Arreglo de notas
        double[] notas = new double[5];
        System.out.println("Ingrese la nota de la 1era parcial");
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota del estudiante nº "+(i+1)+": ");
            notas[i] = Double.parseDouble(System.console().readLine());
            suma = suma + notas[i];
        }
        System.out.println("El promedio del aulas es: "+ suma / notas.length);
    }
}
