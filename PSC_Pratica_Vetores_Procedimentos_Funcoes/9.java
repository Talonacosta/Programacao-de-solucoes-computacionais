import java.util.Scanner;

public class ImpressaoRecibos {
    public static void main(String[] args) {
        // Solicitando ao usuário a quantidade de recibos a serem impressos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de recibos a serem impressos: ");
        int quantidadeRecibos = scanner.nextInt();

        // Variável para controlar o número do recibo
        int numeroRecibo = 1;

        // Imprimindo os números dos recibos utilizando um loop while
        System.out.println("Impressão dos recibos:");
        while (quantidadeRecibos > 0) {
            System.out.println("Recibo " + numeroRecibo);
            quantidadeRecibos--;
            numeroRecibo++;
        }
    }
}
