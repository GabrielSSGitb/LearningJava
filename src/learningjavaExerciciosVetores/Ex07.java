import java.util.Scanner;
import java.util.ArrayList;

public class Ex07 {
    
    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        ArrayList<Integer> primos = new ArrayList<>();

        // Leitura dos 15 números
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (ehPrimo(vetor[i])) {
                primos.add(vetor[i]);
            }
        }

        // Impressão dos números primos
        System.out.println("\nNúmeros primos no vetor:");
        if (primos.isEmpty()) {
            System.out.println("Nenhum número primo encontrado.");
        } else {
            for (int primo : primos) {
                System.out.print(primo + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
