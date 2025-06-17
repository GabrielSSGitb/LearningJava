
package learningjavaExerciciosVetores;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[15];

       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

      
        int maior = vetor[0];
        int posMaior = 0;

        int menor = vetor[0];
        int posMenor = 0;

        // Loop para encontrar maior e menor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior elemento: " + maior + " na posição " + posMaior);
        System.out.println("Menor elemento: " + menor + " na posição " + posMenor);

        scanner.close();
    }
}


