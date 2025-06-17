package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro número positivo: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int num2 = input.nextInt();

        // Validação dos números
        if (num1 < 0 || num2 < 0) {
            System.out.println("Os números devem ser positivos.");
        } else {
            // Chamada da função
            int resultado = somaEntre(num1, num2);

            // Saída
            System.out.println("A soma dos números inteiros entre " + num1 + " e " + num2 + " é: " + resultado);
        }

        input.close();
    }

    public static int somaEntre(int n1, int n2) {
        int soma = 0;

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);


        for (int i = menor + 1; i < maior; i++) {
            soma += i;
        }

        return soma;
    }
}
