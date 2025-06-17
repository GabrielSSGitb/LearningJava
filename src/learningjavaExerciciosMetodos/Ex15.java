package learningjavaExerciciosMetodos;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite x (menor que y): ");
            int x = sc.nextInt();

            System.out.print("Digite y (maior que x): ");
            int y = sc.nextInt();

            if (x == y) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (x >= y || x <= 0 || y <= 0) {
                System.out.println("Entrada inválida! x deve ser menor que y e ambos positivos.\n");
                continue;
            }

            int somaPrimos = somaPrimosEntre(x, y);

            System.out.printf("x = %d, y = %d, soma dos primos entre x e y = %d\n\n", x, y, somaPrimos);
        }

        sc.close();
    }

    // Verifica se um número é primo
    public static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int limite = (int) Math.sqrt(n);
        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Soma os números primos entre x e y (inclusive)
    public static int somaPrimosEntre(int x, int y) {
        int soma = 0;
        for (int i = x; i <= y; i++) {
            if (ehPrimo(i)) {
                soma += i;
            }
        }
        return soma;
    }
}

