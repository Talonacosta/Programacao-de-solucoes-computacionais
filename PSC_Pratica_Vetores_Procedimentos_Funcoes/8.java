import java.util.Arrays;
import java.util.Random;

public class VetorReverso {
    public static void main(String[] args) {
        // Criando um vetor A com 15 números inteiros
        int[] vetorA = new int[15];
        preencherVetorAleatorio(vetorA);

        // Criando um vetor B que é uma cópia reversa do vetor A
        int[] vetorB = copiarReverso(vetorA);

        // Exibindo os vetores A e B
        System.out.println("Vetor A:");
        imprimirVetor(vetorA);
        System.out.println("Vetor B (cópia reversa de A):");
        imprimirVetor(vetorB);
    }

    // Função para preencher um vetor com números inteiros aleatórios
    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Números inteiros aleatórios entre 0 e 99
        }
    }

    // Função para criar uma cópia reversa de um vetor
    public static int[] copiarReverso(int[] vetor) {
        int[] copiaReversa = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            copiaReversa[i] = vetor[vetor.length - 1 - i];
        }
        return copiaReversa;
    }

    // Função para imprimir os elementos de um vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
