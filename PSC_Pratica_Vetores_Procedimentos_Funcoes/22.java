import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        somarNumeros(num1, num2);
    }

    public static void somarNumeros(double num1, double num2) {
        double soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }
}