package learningjavaExerciciosMetodos;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        long[] vetorB = new long[10]; // Usa long para suportar fatoriais grandes

        // Entrada dos valores do vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento [" + (i + 1) + "]: ");
            vetorA[i] = input.nextInt();
        }

        // Chamada da sub-rotina que preenche o vetor B com os fatoriais de A
        calcularFatoriais(vetorA, vetorB);

        // Saída do vetor B
        System.out.println("\nVetor B (fatoriais dos elementos de A):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Fatorial de " + vetorA[i] + " = " + vetorB[i]);
        }

        input.close();
    }

    // 🔥 Sub-rotina que calcula o fatorial de cada elemento de A e preenche B
    public static void calcularFatoriais(int[] vetorA, long[] vetorB) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = fatorial(vetorA[i]);
        }
    }

    // Sub-rotina auxiliar para calcular o fatorial de um número
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}

