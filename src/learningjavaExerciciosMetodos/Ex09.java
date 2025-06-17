package learningjavaExerciciosMetodos;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Entrada dos valores do primeiro vetor
        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 1 - elemento [" + (i + 1) + "]: ");
            vetor1[i] = input.nextInt();
        }

        // Entrada dos valores do segundo vetor
        System.out.println("\nDigite os 10 elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 2 - elemento [" + (i + 1) + "]: ");
            vetor2[i] = input.nextInt();
        }

        // Chamada da sub-rotina
        System.out.println("\nVetor união dos dois vetores:");
        vetorUniao(vetor1, vetor2);

        input.close();
    }

    // ? Sub-rotina que mostra o vetor união
    public static void vetorUniao(int[] v1, int[] v2) {
        ArrayList<Integer> uniao = new ArrayList<>();

        // Adiciona os elementos do primeiro vetor
        for (int num : v1) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        // Adiciona os elementos do segundo vetor
        for (int num : v2) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }

        // Mostra o vetor união
        System.out.print("[ ");
        for (int num : uniao) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
