package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = user.nextInt();
        //Verificando Classe Eleitoral:
        if(idade < 16) {
            System.out.println("Não é um eleitor!");
        }else if(idade >= 18 && idade <= 65) {
            System.out.println("Eleitor Obrigatório!");
        }else if(idade >= 16 && idade <= 18 && idade > 65) {
            System.out.println("Eleitor Facultativo!");
        }else {
            System.out.println("Digite uma idade válida!");
        };
    }
}
/*
Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral
 */