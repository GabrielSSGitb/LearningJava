package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        // Entrada da letra
        System.out.print("Digite 'A' para média Aritmética ou 'P' para média Ponderada: ");
        char opcao = input.next().toUpperCase().charAt(0);

        // Chamada da sub-rotina
        double media = calcularMedia(nota1, nota2, nota3, opcao);

        // Verificação se a letra foi válida
        if (media != -1) {
            System.out.printf("A média calculada é: %.2f\n", media);
        } else {
            System.out.println("Opção inválida! Use 'A' ou 'P'.");
        }

        input.close();
    }

    // ? Sub-rotina que calcula a média
    public static double calcularMedia(double n1, double n2, double n3, char tipo) {
        if (tipo == 'A') {
            return (n1 + n2 + n3) / 3;
        } else if (tipo == 'P') {
            return (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        } else {
            return -1; // Valor inválido para tipo
        }
    }
}
