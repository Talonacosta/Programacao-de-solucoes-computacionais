import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Solicitar ao usuário inserir um número inteiro N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("Números primos menores ou iguais a " + n + ":");

        // Iterar de 2 até o número fornecido
        for (int i = 2; i <= n; i++) {
            // Verificar se o número é primo
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
