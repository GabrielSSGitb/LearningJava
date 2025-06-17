
package learningjavaExerciciosVetores;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];

        // Leitura do vetor A
        System.out.println("Digite 10 números inteiros (positivos, negativos ou zero):");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Contando quantos valores positivos existem
        int countPositivos = 0;
        for (int valor : vetorA) {
            if (valor > 0) {
                countPositivos++;
            }
        }

        // Criando vetor B com tamanho exato para armazenar apenas os positivos
        int[] vetorB = new int[countPositivos];
        int indexB = 0;

        for (int valor : vetorA) {
            if (valor > 0) {
                vetorB[indexB] = valor;
                indexB++;
            }
        }

        // Mostrando o vetor resultante B
        System.out.println("\nVetor B (valores positivos compactados):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Posição " + i + ": " + vetorB[i]);
        }

        scanner.close();
    }
}


