package Ejercicios5;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = System.console().readLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = System.console().readLine();
        int tipoIVANumerico = 0;
        
        switch(tipoIVA) {
          case "general":
            tipoIVANumerico = 21;
            break;
          case "reducido":
            tipoIVANumerico = 10;
            break;
          case "superreducido":
            tipoIVANumerico = 4;
            break;
          default:
            System.out.println("El tipo de IVA introducido no es correcto.");
        }
        double iva = baseImponible * tipoIVANumerico / 100;
        double precioSinDescuento = baseImponible + iva;
        double descuento = 0;
        
        switch(codigoPromocional) {
          case "nopro":
            break;
          case "mitad": 
            descuento = precioSinDescuento / 2;
            break;
          case "meno5": 
            descuento = 5;
            break;
          case "5porc": 
            descuento = precioSinDescuento * 0.05;
            break;
          default:
            System.out.println("El código promocional introducido no es correcto.");
        }
        double total = precioSinDescuento - descuento;
        
        System.out.printf("Base imponible       %6.2f\n", baseImponible);
        System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANumerico, iva);
        System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
        System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
        System.out.printf("TOTAL                %6.2f", total);
      }
}
