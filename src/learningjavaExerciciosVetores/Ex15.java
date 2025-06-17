import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Leitura do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        // Substituição de valores negativos por 0
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        // Impressão do vetor alterado
        System.out.println("\nVetor alterado (negativos substituídos por 0):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
