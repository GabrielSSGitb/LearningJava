import java.util.Scanner;

public class Ex09 {

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
        int[] vetor = new int[10];

        // Leitura dos 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Verificação e exibição dos primos com posição
        System.out.println("\nNúmeros primos e suas posições:");
        boolean encontrouPrimo = false;
        for (int i = 0; i < 10; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Valor: " + vetor[i] + " - Posição: " + i);
                encontrouPrimo = true;
            }
        }

        if (!encontrouPrimo) {
            System.out.println("Nenhum número primo encontrado.");
        }

        scanner.close();
    }
}
