import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Solicitar ao usuário inserir um número inteiro positivo N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        // Imprimir os N primeiros termos da sequência de Fibonacci
        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    // Função para calcular o termo da sequência de Fibonacci dado um índice
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
