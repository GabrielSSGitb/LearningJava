
package learningjava.ExerciciosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        ArrayList<Integer> listofEven = new ArrayList();
        int num = 1;
        int media = 0;
        int i = 1;
        while(num != 0) {
            System.out.print("Digite um número inteiro ");
            System.out.println("Ou pressione 0 para sair");
            System.out.print("Número: ");
            num = user.nextInt();
            int check = num%2;
            i += 1;
            if(check == 0) {
                listofEven.add(num);
                media += num/i;
            }
        }
        System.out.println("Média dos números inteiros equivale à: "+media);
    }
}
