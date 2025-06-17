
package learningjavaExerciciosMetodos;
public class Ex11 {

    public static int[] primeirosNumerosPerfeitos(int qtd) {
        int[] perfeitos = new int[qtd];
        int count = 0;
        int num = 2; // começa a verificar do 2 em diante

        while (count < qtd) {
            int somaDivisores = 0;

            // soma divisores próprios até num/2
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == num) {
                perfeitos[count] = num;
                count++;
            }

            num++;
        }

        return perfeitos;
    }

    public static void main(String[] args) {
        int[] perfeitos = primeirosNumerosPerfeitos(3);

        System.out.print("Três primeiros números perfeitos: ");
        for (int p : perfeitos) {
            System.out.print(p + " ");
        }
    }
}

