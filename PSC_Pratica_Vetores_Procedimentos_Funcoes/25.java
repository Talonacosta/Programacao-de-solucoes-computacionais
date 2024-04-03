import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        calcularPerimetro(raio);
    }

    public static void calcularPerimetro(double raio) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}
