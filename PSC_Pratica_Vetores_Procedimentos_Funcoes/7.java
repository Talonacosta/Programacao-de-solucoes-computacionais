import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        // Criando um vetor de 5 posições de números decimais
        double[] vetor = new double[5];

        // Preenchendo o vetor com valores fornecidos pelo usuário
        preencherVetor(vetor);

        // Encontrando o maior e o menor valor do vetor
        double maiorValor = encontrarMaiorValor(vetor);
        double menorValor = encontrarMenorValor(vetor);

        // Exibindo o vetor e os resultados
        System.out.println("Vetor:");
        imprimirVetor(vetor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    // Função para preencher um vetor com valores fornecidos pelo usuário
    public static void preencherVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
    }

    // Função para encontrar o maior valor em um vetor de números decimais
    public static double encontrarMaiorValor(double[] vetor) {
        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Função para encontrar o menor valor em um vetor de números decimais
    public static double encontrarMenorValor(double[] vetor) {
        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Função para imprimir os elementos de um vetor de números decimais
    public static void imprimirVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
