package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite um número entre 1 e 9: ");
        int n = input.nextInt();

        // Validação
        if (n < 1 || n > 9) {
            System.out.println("Número inválido. Digite um número entre 1 e 9.");
        } else {
            // Chamada da sub-rotina
            gerarTabelaMultiplicacao(n);
        }

        input.close();
    }

    // ? Sub-rotina que gera a tabela triangular de multiplicação
    public static void gerarTabelaMultiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", i * j); // Alinhamento bonito
            }
            System.out.println();
        }
    }
}
