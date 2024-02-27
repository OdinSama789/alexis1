package Clases6Parcial2;
    import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args) {
        String palo = "";
        String carta = "";;
        int nºPalo = (int)(Math.random()*4) + 1;
    switch(nºPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
      default:
    }
    int nºCarta = (int)(Math.random()*13) + 1;
    switch(nºCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(nºCarta);
    }
    System.out.println(carta + " de " + palo);
    }
}
