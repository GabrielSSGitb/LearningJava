import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int soma = 0;

        // Leitura dos elementos
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        // Cálculo da média
        double media = (double) soma / 15;
        System.out.printf("\nMédia dos elementos: %.2f\n", media);

        // Verificação dos elementos menores que a média
        boolean encontrouMenor = false;
        System.out.println("\nElementos menores que a média e suas posições:");
        for (int i = 0; i < 15; i++) {
            if (vetor[i] < media) {
                System.out.println("Valor: " + vetor[i] + " - Posição: " + i);
                encontrouMenor = true;
            }
        }

        // Mensagem caso não haja elementos menores que a média
        if (!encontrouMenor) {
            System.out.println("Nenhum elemento é menor que a média.");
        }

        scanner.close();
    }
}


