
package learningjavaExerciciosVetores;
import java.util.Scanner;
import java.util.Random;
public class Ex03 {

    public static void main(String[] args) {
        int[] numeros = new int[50];
        Random random = new Random();

        // Preenchendo o vetor com valores aleatórios entre -100 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(201) - 100; // Gera valores de -100 a 100
        }

        // Exibindo os números positivos
        System.out.println("Números positivos no vetor:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}




