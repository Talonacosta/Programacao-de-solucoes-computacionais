import java.util.Scanner;

public class VerificarProduto {
    public static void main(String[] args) {
        int[] codigos = {101, 202, 303, 404, 505};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        boolean presente = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigo == codigos[i]) {
                presente = true;
                break;
            }
        }
        if (presente) {
            System.out.println("O produto está presente no estoque.");
        } else {
            System.out.println("O produto não está presente no estoque.");
        }
    }
}
