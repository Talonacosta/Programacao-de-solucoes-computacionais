public class ParImpar {
  public static void main(String[] args) {
      int numero = 5;
      if (ehPar(numero)) {
          System.out.println(numero + " é par.");
      } else {
          System.out.println(numero + " é ímpar.");
      }
  }

  public static boolean ehPar(int num) {
      return num % 2 == 0;
  }
}
