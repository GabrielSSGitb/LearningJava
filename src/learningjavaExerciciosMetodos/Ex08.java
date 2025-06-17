package learningjavaExerciciosMetodos;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite um número inteiro e positivo N: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Número inválido! Digite um número positivo.");
        } else {
            // Chamada da sub-rotina
            double resultado = calcularSomaFatorial(n);

            // Saída
            System.out.printf("O valor de S é: %.5f\n", resultado);
        }

        input.close();
    }

    // 🔥 Sub-rotina que calcula S
    public static double calcularSomaFatorial(int n) {
        double soma = 1.0; // Começa com 1

        double fatorial = 1.0;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            soma += 1.0 / fatorial;
        }

        return soma;
    }
}
