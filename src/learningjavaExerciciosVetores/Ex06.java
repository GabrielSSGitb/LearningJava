
package learningjavaExerciciosVetores;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        // Leitura do vetor A
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Leitura do vetor B
        System.out.println("\nDigite 5 números inteiros para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Subtração inversa: C[i] = B[4 - i] - A[i]
        for (int i = 0; i < 5; i++) {
            C[i] = B[4 - i] - A[i];
        }

        // Exibindo os vetores
        System.out.println("\nVetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\nVetor C (B[4-i] - A[i]):");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}


