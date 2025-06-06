package learningjava.ExerciciosRepeticao;

import java.util.Scanner;


public class Ex07 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int num = 1;
        while(num != 0) {
            System.out.println("Digite um número (n) para verificar se ele é primo!");
            System.out.println("Digite 0 para sair!!!");
            System.out.print("Número: ");
            num = user.nextInt();
            
            if(num%2 == 0 && num > 2) {
                System.out.println("O valor digitado não é primo!!!");
            }else {
                System.out.println("O valor digitado é primo!!!");
            }
        }
    }
}
