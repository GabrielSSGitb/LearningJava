package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite o valor de A (maior que 1): ");
        int a = input.nextInt();
        while (a <= 1) {
            System.out.print("A deve ser maior que 1. Digite novamente: ");
            a = input.nextInt();
        }

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();

        // Chamada da função
        int resultado = somarDivisiveis(a, b, c);

        // Saída do resultado
        System.out.println("A soma dos números divisíveis por " + a + " entre " + b + " e " + c + " é: " + resultado);

        input.close();
    }

 
    public static int somarDivisiveis(int a, int b, int c) {
        int soma = 0;

        // Verificar intervalo correto (de menor para maior)
        int inicio = Math.min(b, c);
        int fim = Math.max(b, c);

        // Percorrer o intervalo
        for (int i = inicio; i <= fim; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
