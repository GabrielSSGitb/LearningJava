package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" =========== Calculando IMC =========== ");
        System.out.print("Informe o seu peso:");
        double weight = user.nextDouble();
        System.out.print("Informe o seu altura:");
        double height = user.nextDouble();
        double imc = weight/Math.pow(height,2);
        //Classificando IMC:
        if(imc < 20) {
            System.out.println("Você está abaxo do peso!!!");
        }else if(imc >=20 && imc < 25) {
            System.out.println("Você tem um peso normal, vagabundo(a)!!!");
        }else if(imc >=25 && imc < 30) {
            System.out.println("Você está sobre o peso!!!");
        }else if(imc >=30 && imc < 40) {
            System.out.println("Você está obeso!!!");
        }else {
            System.out.println("💀 Obeso Mórbido 💀");
        };
    }
}
/*
Calculando IMC:
IMC = peso/altura**2
 */
