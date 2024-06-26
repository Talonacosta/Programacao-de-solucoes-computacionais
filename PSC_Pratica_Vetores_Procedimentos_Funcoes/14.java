import java.util.Scanner;

public class TempoProducao {
    public static void main(String[] args) {
        // Solicitar ao usuário o número de etapas de produção
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de etapas de produção: ");
        int numeroEtapas = scanner.nextInt();

        // Calcular o tempo total de produção
        int tempoTotal = calcularTempoProducao(numeroEtapas);

        // Imprimir o tempo total de produção
        System.out.println("O tempo total de produção é de " + tempoTotal + " minutos.");
    }

    // Função para calcular o tempo total de produção com base no número de etapas
    public static int calcularTempoProducao(int numeroEtapas) {
        // Cada etapa de produção tem a duração de 30 minutos
        return numeroEtapas * 30;
    }
}
