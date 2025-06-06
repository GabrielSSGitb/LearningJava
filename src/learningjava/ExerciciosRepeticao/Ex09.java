package learningjava.ExerciciosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        ArrayList<Integer> listN = new ArrayList();
        System.out.print("Digite um número inteiro (n):");
        int n = user.nextInt();
        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                listN.add(i);
            }
        }
        System.out.println("Lista dos números divisíveis: "+listN.toString());
    }
}
