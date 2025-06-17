import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        boolean encontrado = false;

        // Leitura dos 10 elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Solicita número a ser buscado
        System.out.print("\nInforme um número para buscar no vetor: ");
        int numeroBuscado = scanner.nextInt();

        // Verificação do número no vetor
        System.out.println("\nResultado da busca:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }
        }

        // Caso o número não seja encontrado
        if (!encontrado) {
            System.out.println("O número " + numeroBuscado + " não se encontra no vetor.");
        }

        scanner.close();
    }
}
