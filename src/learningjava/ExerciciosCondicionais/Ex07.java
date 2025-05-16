package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println(" =========== Auxílio Picanha do Governo Lula =========== ");
        System.out.print("Quanto você ganha atualmente: ");
        double salary = user.nextDouble();
        if(salary < 1000 && salary != 0) {
            double newSalary = salary + (salary*0.3);
            System.out.println("Seu salário com o benefício é igual a: "+newSalary);
        }else if(salary >= 1000) {
            System.out.println("Você já ganha muito, vagabundo(a)!");
        }else if(salary == 0) {
            System.out.println("Coitado, a Fiat deve estar contratando!");
        }else {
            System.out.println("Digite um valor válido!");
        };
    }
}
/*
Aumento Salarial:
Caso salário < R$ 1000,00 => Aumento de 30%
 */
