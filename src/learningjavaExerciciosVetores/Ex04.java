
package learningjavaExerciciosVetores;
import java.util.Random;
public class Ex04 {
    public static void main(String[] args) {
        int[] vetorOriginal = new int[30];
        int[] vetorModificado = new int[30];

        Random random = new Random();

        // Preenchendo vetor original com valores aleatórios entre -10 e 10
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = random.nextInt(21) - 10; // -10 a 10

            // Criando vetor modificado: substituindo 0 por 1
            if (vetorOriginal[i] == 0) {
                vetorModificado[i] = 1;
            } else {
                vetorModificado[i] = vetorOriginal[i];
            }
        }

        // Mostrando os dois vetores
        System.out.println("Vetor Original\tVetor Modificado");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.println("     " + vetorOriginal[i] + "\t\t     " + vetorModificado[i]);
        }
    }
}


