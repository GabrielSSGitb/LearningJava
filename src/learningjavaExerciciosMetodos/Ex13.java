
package learningjavaExerciciosMetodos;
import java.util.Arrays;
import java.util.Collections;

public class Ex13 {

    public static void criarVetorC(int[] A, int[] B, int[] C) {
        // Copia os elementos de A e B para C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        // Ordena o vetor C em ordem crescente
        // Para usar Collections.reverseOrder, precisa de Integer[], não int[]
        Integer[] C_obj = new Integer[C.length];
        for (int i = 0; i < C.length; i++) {
            C_obj[i] = C[i];
        }

        // Ordena em ordem decrescente
        Arrays.sort(C_obj, Collections.reverseOrder());

        // Copia de volta para C (int[])
        for (int i = 0; i < C.length; i++) {
            C[i] = C_obj[i];
        }
    }

    public static void main(String[] args) {
        int[] A = {5, 10, 3, 8, 2, 9, 1, 7, 6, 4};
        int[] B = {15, 12, 13, 18, 11, 19, 14, 17, 16, 20};
        int[] C = new int[A.length + B.length];

        criarVetorC(A, B, C);

        System.out.print("Vetor C em ordem decrescente: ");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
    }
}

