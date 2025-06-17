import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] multiplicacao = new int[10];
        double[] divisao = new double[10];

        // Leitura do primeiro vetor
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("\nDigite 10 números inteiros para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
        }

        // Cálculo dos vetores multiplicação e divisão
        for (int i = 0; i < 10; i++) {
            multiplicacao[i] = vetor1[i] * vetor2[i];

            if (vetor2[i] != 0) {
                divisao[i] = (double) vetor1[i] / vetor2[i];
            } else {
                divisao[i] = Double.NaN; // ou outro valor que indique divisão inválida
            }
        }

        // Impressão dos 4 vetores
        System.out.println("\nVetor 1:");
        for (int valor : vetor1) System.out.print(valor + " ");

        System.out.println("\n\nVetor 2:");
        for (int valor : vetor2) System.out.print(valor + " ");

        System.out.println("\n\nVetor Multiplicação:");
        for (int valor : multiplicacao) System.out.print(valor + " ");

        System.out.println("\n\nVetor Divisão:");
        for (int i = 0; i < 10; i++) {
            if (Double.isNaN(divisao[i])) {
                System.out.print("Erro ");
            } else {
                System.out.printf("%.2f ", divisao[i]);
            }
        }

        scanner.close();
    }
}
