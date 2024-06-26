import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Solicitando ao usuário o número para a tabuada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        // Imprimindo a tabuada do número fornecido até 10
        System.out.println("Tabuada do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}