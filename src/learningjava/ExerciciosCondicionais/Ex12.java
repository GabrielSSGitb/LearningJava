package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Informe um número inteiro qualquer: ");
        int n1 = user.nextInt();
        System.out.print("Informe outro número inteiro qualquer: ");
        int n2 = user.nextInt();
        System.out.println("O que deseja Fazer?");
        System.out.println("[1] - Somar");
        System.out.println("[2] - Subtrair");
        System.out.println("[3] - Multiplicar");
        System.out.println("[4] - Dividir");
        System.out.println("[5] - Sair");
        System.out.print("Escolha: ");
        int escolha = user.nextInt();
        //tratamento:
        switch(escolha) {
            case 1:
                System.out.println(n1+" + "+n2+" é igual a "+(n1+n2));
                break;
            case 2:
                System.out.println(n1+" - "+n2+" é igual a "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+" X "+n2+" é igual a "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+" ➗ "+n2+" é igual a "+(n1/n2));
                break;
            case 5:
                System.out.println("Saindo.........");
                break;
            default:
                System.out.println("Por favor, digite uma das opções no menu, reinicie o programa!!!");
                break;
        }
    }
}
