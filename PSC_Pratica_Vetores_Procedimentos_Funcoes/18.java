import java.util.Scanner;

public class TemperaturaMaisAlta {
    public static void main(String[] args) {
        double[] temperaturas = new double[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as temperaturas registradas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maiorTemperatura = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }
        System.out.println("A maior temperatura registrada é: " + maiorTemperatura);
    }
}
