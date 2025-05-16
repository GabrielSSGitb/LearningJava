package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        double pesoIdeal = 0;
        System.out.print("Por favor, informe a sua altura: ");
        double H = user.nextDouble();
        System.out.println(" ======= Selecione uma das opções abaixo  ======= ");
        System.out.println("[1] - Homem");
        System.out.println("[2] - Mulher");
        System.out.print("Escolha: ");
        int sex = user.nextInt();

        switch(sex) {
            case 1:
                pesoIdeal = (72.7*H) - 58;
                break;
                case 2:
                    pesoIdeal = (62.1*H) - 44.7;
                    break;
                    default:
                        System.out.println("Informe corretamente sua altura e sexo!");
        }
        System.out.println("Seu peso ideal equivale a: "+pesoIdeal);
    }
}
/*
Calculndo o peso ideal de uma pessoa:
Altura => (H - em Metros)
Peso Ideal Homens: (72,7*H) - 58
Peso Ideal Mulheres: (62,1*H) - 44,7
 */