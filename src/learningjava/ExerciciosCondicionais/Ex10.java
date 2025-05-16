package learningjava.ExerciciosCondicionais;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 7: ");
        int num = user.nextInt();
        String[] week = new String[7];
        week[0] = "Segunda";
        week[1] = "Terça";
        week[2] = "Quarta";
        week[3] = "Quinta";
        week[4] = "Sexta";
        week[5] = "Sábado";
        week[6] = "Domingo";
        if(num == 1) {
            System.out.println(week[0]);
        }else if(num == 2) {
            System.out.println(week[1]);
        }else if(num == 3) {
            System.out.println(week[2]);
        }else if(num == 4) {
            System.out.println(week[3]);
        }else if(num == 5) {
            System.out.println(week[4]);
        }
    }
}
/*
Ler um número inteiro e relacionar com os dias da semana
 */
