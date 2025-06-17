import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        String[] alunos = new String[10];
        double soma = 0;

        // Leitura dos nomes e notas
        System.out.println("Digite o nome e a nota de 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
            System.out.print("Nota de " + alunos[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            soma += notas[i];
        }

        // Cálculo da média
        double media = soma / 10;
        System.out.printf("\nMédia das notas: %.2f\n", media);

        // Alunos com nota abaixo da média
        System.out.println("\nAlunos com nota abaixo da média:");
        boolean abaixoDaMedia = false;
        for (int i = 0; i < 10; i++) {
            if (notas[i] < media) {
                System.out.printf("%s - Nota: %.2f\n", alunos[i], notas[i]);
                abaixoDaMedia = true;
            }
        }
        if (!abaixoDaMedia) {
            System.out.println("Nenhum aluno ficou abaixo da média.");
        }

        // Alunos com nota maior ou igual à média
        System.out.println("\nAlunos com nota maior ou igual à média:");
        boolean acimaOuIgual = false;
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= media) {
                System.out.printf("%s - Nota: %.2f\n", alunos[i], notas[i]);
                acimaOuIgual = true;
            }
        }
        if (!acimaOuIgual) {
            System.out.println("Nenhum aluno ficou acima ou igual à média.");
        }

        scanner.close();
    }
}
