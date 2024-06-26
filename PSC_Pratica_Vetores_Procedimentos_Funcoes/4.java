import java.util.Random;

public class VerificarNumero {
    public static void main(String[] args) {
        // Criando um vetor com 20 números inteiros aleatórios entre 1 e 30
        int[] vetor = new int[20];
        preencherVetorAleatorio(vetor, 1, 30);

        // Verificando se o número 25 existe no vetor
        boolean encontrado = verificarNumero(vetor, 25);

        // Exibindo o vetor e o resultado da verificação
        System.out.println("Vetor:");
        imprimirVetor(vetor);
        if (encontrado) {
            System.out.println("O número 25 foi encontrado no vetor.");
        } else {
            System.out.println("O número 25 não foi encontrado no vetor.");
        }
    }

    // Função para preencher um vetor com números inteiros aleatórios dentro de um intervalo especificado
    public static void preencherVetorAleatorio(int[] vetor, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max - min + 1) + min;
        }
    }

    // Função para verificar se um número existe em um vetor
    public static boolean verificarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Função para imprimir os elementos de um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}