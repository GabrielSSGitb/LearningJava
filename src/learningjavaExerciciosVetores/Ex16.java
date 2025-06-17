import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosSorteados = new int[6];
        int[] numerosApostados = new int[6];
        int acertos = 0;

        // Leitura dos números sorteados
        System.out.println("Digite os 6 números sorteados da Mega Sena:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Sorteado " + (i + 1) + ": ");
            numerosSorteados[i] = scanner.nextInt();
        }

        // Leitura dos números apostados
        System.out.println("\nDigite os 6 números do seu cartão:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Apostado " + (i + 1) + ": ");
            numerosApostados[i] = scanner.nextInt();
        }

        // Verifica quantos números coincidem
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosApostados[i] == numerosSorteados[j]) {
                    acertos++;
                    break; // Evita contar o mesmo número sorteado mais de uma vez
                }
            }
        }

        // Resultado
        System.out.println("\nVocê acertou " + acertos + " número(s).");

        scanner.close();
    }
}
