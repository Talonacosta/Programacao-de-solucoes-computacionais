import java.util.Arrays;
import java.util.Scanner;

public class OrdenarPrecos {
    public static void main(String[] args) {
        double[] precos = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os preços dos produtos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        Arrays.sort(precos);

        System.out.println("Preços dos produtos em ordem crescente:");
        for (double preco : precos) {
            System.out.println(preco);
        }
    }
}
