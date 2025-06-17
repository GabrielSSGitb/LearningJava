
package learningjavaExerciciosMetodos;
public class Ex14 {

    public static int somaElementos(int[][] A) {
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                soma += A[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int resultado = somaElementos(matriz);
        System.out.println("Soma dos elementos da matriz: " + resultado);
    }
}

