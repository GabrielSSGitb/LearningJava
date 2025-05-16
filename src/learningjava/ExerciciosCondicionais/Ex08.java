package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Por favor, informe a sua idade: ");
        int age = user.nextInt();
        //Verificando classificação:
        if(age <= 7) {
            System.out.println("Categoria infantil");
        }else if(age > 8 && age <= 10) {
            System.out.println("Categoria Juvenil");
        }else if(age > 11 && age <= 15) {
            System.out.println("Categoria Adolecente");
        }else if(age > 16 && age <= 30) {
            System.out.println("Categoria Adulto");
        }else if(age > 30) {
            System.out.println("Categoria Senior");
        }else {
            System.out.println("Digite um valor válido!");
        }
    }
}
/*
Faça um programa que receba a idade de um nadador e mostre a sua categoria
 */
