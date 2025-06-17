
package learningjavaExerciciosMetodos;
import java.util.Scanner;

public class Ex12 {
    static final int QTD = 5;

    public static void main(String[] args) {
        char[] sexos = new char[QTD];
        char[] olhos = new char[QTD];
        char[] cabelos = new char[QTD];
        int[] idades = new int[QTD];

        lerDados(sexos, olhos, cabelos, idades);

        double media = mediaIdadeOlhosCastanhosCabelosPretos(olhos, cabelos, idades);
        int maiorIdade = maiorIdade(idades);
        int quantidadeMulheres = quantidadeMulheresAzuisLouros(sexos, olhos, cabelos, idades);

        System.out.printf("Média de idade (olhos castanhos e cabelos pretos): %.2f\n", media);
        System.out.println("Maior idade entre os habitantes: " + maiorIdade);
        System.out.println("Quantidade de mulheres com idade entre 18 e 35 anos, olhos azuis e cabelos louros: " + quantidadeMulheres);
    }

    // Lê os dados dos habitantes e armazena nos vetores
    public static void lerDados(char[] sexos, char[] olhos, char[] cabelos, int[] idades) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < QTD; i++) {
            System.out.printf("Habitante %d:\n", i + 1);

            System.out.print("Sexo (M/F): ");
            sexos[i] = Character.toUpperCase(sc.next().charAt(0));

            System.out.print("Cor dos olhos (A - azuis / C - castanhos): ");
            olhos[i] = Character.toUpperCase(sc.next().charAt(0));

            System.out.print("Cor dos cabelos (L - louros / P - pretos / C - castanhos): ");
            cabelos[i] = Character.toUpperCase(sc.next().charAt(0));

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.println();
        }
    }

    // Calcula a média de idade das pessoas com olhos castanhos e cabelos pretos
    public static double mediaIdadeOlhosCastanhosCabelosPretos(char[] olhos, char[] cabelos, int[] idades) {
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < QTD; i++) {
            if (olhos[i] == 'C' && cabelos[i] == 'P') {
                soma += idades[i];
                cont++;
            }
        }

        return (cont > 0) ? (double) soma / cont : 0;
    }

    // Encontra a maior idade
    public static int maiorIdade(int[] idades) {
        int maior = idades[0];

        for (int i = 1; i < QTD; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }

        return maior;
    }

    // Conta mulheres entre 18 e 35 anos com olhos azuis e cabelos louros
    public static int quantidadeMulheresAzuisLouros(char[] sexos, char[] olhos, char[] cabelos, int[] idades) {
        int cont = 0;

        for (int i = 0; i < QTD; i++) {
            if (sexos[i] == 'F' && idades[i] >= 18 && idades[i] <= 35 && olhos[i] == 'A' && cabelos[i] == 'L') {
                cont++;
            }
        }

        return cont;
    }
}

