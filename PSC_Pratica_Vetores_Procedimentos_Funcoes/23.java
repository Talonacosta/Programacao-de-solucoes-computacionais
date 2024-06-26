import java.util.Scanner;

public class ConsumoCarros {
    public static void main(String[] args) {
        String[] modelos = new String[5];
        double[] consumo = new double[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os modelos dos carros e seus consumos:");
        for (int i = 0; i < modelos.length; i++) {
            System.out.print("Modelo do carro " + (i + 1) + ": ");
            modelos[i] = scanner.next();
            System.out.print("Consumo do carro " + (i + 1) + " (km/l): ");
            consumo[i] = scanner.nextDouble();
        }

        int maisEconomicoIndice = 0;
        for (int i = 1; i < consumo.length; i++) {
            if (consumo[i] > consumo[maisEconomicoIndice]) {
                maisEconomicoIndice = i;
            }
        }

        System.out.println("O modelo mais econômico é: " + modelos[maisEconomicoIndice]);

        System.out.println("Litros de combustível consumidos para percorrer 1000 km:");
        for (int i = 0; i < modelos.length; i++) {
            double litros = 1000 / consumo[i];
            System.out.println(modelos[i] + ": " + litros + " litros");
        }
    }
}
