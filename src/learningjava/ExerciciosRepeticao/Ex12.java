
package learningjava.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, totalPessoas = 0, mulheres = 0;
        double salario, somaSalarios = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';

        while (true) {
            System.out.print("Digite a idade (negativa para sair): ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F/I): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();

            totalPessoas++;
            somaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'F') {
                mulheres++;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

            System.out.println(); // linha em branco para melhor visualização
        }

        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;

            System.out.printf("Média dos salários: R$ %.2f%n", mediaSalarios);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade de mulheres: " + mulheres);
            System.out.printf("Pessoa com menor salário: idade = %d, sexo = %c, salário = R$ %.2f%n",
                    idadeMenorSalario, sexoMenorSalario, menorSalario);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}


