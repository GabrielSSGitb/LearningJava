import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Pense em um número de 1 a 8 e eu vou tentar adivinhar com 3 perguntas!");

        
        System.out.print("O número está entre 5 e 8? (s/n): ");
        String resp1 = input.nextLine();
        if (resp1.equalsIgnoreCase("s")) {
            numero += 4; // bit mais significativo (100)
            System.out.println(numero);
        }


        System.out.print("O número está em {3, 4, 7, 8}? (s/n): ");
        String resp2 = input.nextLine();
        if (resp2.equalsIgnoreCase("s")) {
            numero += 2; // bit do meio (010)
            System.out.println(numero);
        }


        System.out.print("O número está em {2, 4, 6, 8}? (s/n): ");
        String resp3 = input.nextLine();
        if (resp3.equalsIgnoreCase("s")) {
            numero += 1; // bit menos significativo (001)
            System.out.println(numero);
        }

     
        numero += 1;

        System.out.println("\nSeu número é: " + numero + " 😎");

        input.close();
    }
}
