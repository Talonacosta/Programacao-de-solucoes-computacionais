import java.util.Scanner;

public class IntercalacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando vetores para armazenar os elementos

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        // Preenchendo o primeiro vetor

        System.out.println("Preencha o primeiro vetor com 10 elementos:");
        preencherVetor(scanner, vetor1);

        // Preenchendo o segundo vetor

        System.out.println("Preencha o segundo vetor com 10 elementos:");
        preencherVetor(scanner, vetor2);

        //Intercalando os vetores

        int posicaoVetorIntercalado = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[posicaoVetorIntercalado++] = vetor1[i];
            vetorIntercalado[posicaoVetorIntercalado++] = vetor2[i];
        }

        // Exibindo o vetor resultante da intercalação
        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
    }

    // Função para preencher um vetor com elementos fornecidos pelo usuário
    public static void preencherVetor(Scanner scanner, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }
}
