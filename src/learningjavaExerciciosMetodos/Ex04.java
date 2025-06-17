package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite o valor antigo do produto: ");
        double valorAntigo = input.nextDouble();

        System.out.print("Digite o valor atual do produto: ");
        double valorAtual = input.nextDouble();

        // Chamada da sub-rotina
        double percentual = calcularPercentualAumento(valorAntigo, valorAtual);

        // Exibir resultado
        System.out.printf("O percentual de acréscimo foi de: %.2f%%\n", percentual);

        input.close();
    }

    // ? Sub-rotina que calcula o percentual de acréscimo
    public static double calcularPercentualAumento(double antigo, double atual) {
        if (antigo == 0) {
            System.out.println("Erro: o valor antigo não pode ser zero.");
            return 0;
        }

        double aumento = atual - antigo;
        double percentual = (aumento / antigo) * 100;
        return percentual;
    }
}
