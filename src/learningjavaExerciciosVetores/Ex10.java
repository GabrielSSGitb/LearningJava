
package learningjavaExerciciosVetores;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 6 números inteiros:");

        // Leitura dos números
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nNúmeros pares digitados: ");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                somaPares += numeros[i];
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        System.out.print("\nNúmeros ímpares digitados: ");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
                qtdImpares++;
            }
        }

        System.out.println("\nQuantidade de números ímpares: " + qtdImpares);

        scanner.close();
    }
}


