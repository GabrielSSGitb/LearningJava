
package learningjava.ExerciciosRepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Digite um número qualquer: ");
        int num = user.nextInt();
        int c = 0;
        int r = 1;
        while(c < num) {
            r += c;
            c++;
        }
        System.out.print("Com o contador igual a "+c);
        System.out.println(", obtemos o resultado da soma igual a "+r);
    }
}
