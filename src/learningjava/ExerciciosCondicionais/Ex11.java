package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Por favor, digite um número entre 1 e 12!!");
        System.out.print("Número: ");
        int n = user.nextInt();
        if(n == 1) {
            addMonths(0);
        }else if(n == 2) {
            addMonths(1);
        }else if(n == 3) {
            addMonths(2);
        }else if(n == 4) {
            addMonths(3);
        }else if(n == 5) {
            addMonths(4);
        }else if(n == 6) {
            addMonths(5);
        }else if(n == 7) {
            addMonths(6);
        }else if(n == 8) {
            addMonths(7);
        }else if(n == 9) {
            addMonths(8);
        }else if(n == 10) {
            addMonths(9);
        }else if(n == 11) {
            addMonths(10);
        }else if(n == 12) {
            addMonths(11);
        }else {
            System.out.println("Por favor, reinicie o programa e digite um valor válido!!!");
        }
        
    }    
public static void addMonths(int n) {
    String[] months = new String[12];
    months[0] = "Janeiro";
    months[1] = "Fevereiro";
    months[2] = "Março";
    months[3] = "Abril";
    months[4] = "Maio";
    months[5] = "Junho";
    months[6] = "Julho";
    months[7] = "Agosto";
    months[8] = "Setembro";
    months[9] = "Outubro";
    months[10] = "Novembro";
    months[11] = "Dezembro";
    System.out.println("O mês digitado equivale a: "+months[n]);
}
}
