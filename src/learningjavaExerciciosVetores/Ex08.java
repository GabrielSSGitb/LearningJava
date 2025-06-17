import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        double[] vetorDividido = new double[15];
        int maior = Integer.MIN_VALUE;

        // Leitura dos números
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // Divisão dos elementos pelo maior valor
        for (int i = 0; i < 15; i++) {
            vetorDividido[i] = (double) vetor[i] / maior;
        }

        // Impressão do vetor resultante
        System.out.println("\nVetor após divisão pelo maior valor (" + maior + "):");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%.2f ", vetorDividido[i]);
        }

        scanner.close();
    }
}
