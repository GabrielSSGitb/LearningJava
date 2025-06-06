
package learningjava.ExerciciosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        ArrayList<String> typeofGas = new ArrayList();
        ArrayList<String> nameClient = new ArrayList();
        int control = 5;
        while(control != 0) {
            System.out.println("Qual seu nome vagabundo?");
            System.out.print("Nome: ");
            nameClient.add(user.nextLine());
            System.out.println("Escolha uma opção:");
            System.out.println("(1) - Álcool");
            System.out.println("(2) - Gasolina");
            System.out.println("(3) - Diesel");
            System.out.println("(4) - Fim do cadastro");
            System.out.print("Escolha: ");
            control = Integer.parseInt(user.nextLine());
            //Inserção e tratamento de dados:
            if(control == 1) {
                typeofGas.add("Álcool");
            }else if(control == 2) {
                typeofGas.add("Gasolina");
            }else if(control == 3) {
                typeofGas.add("Diesel");
            }else if(control > 4 || control < 1) {
                System.out.println("Por favor, cadastre corretamente!!!");
            }else {
                System.out.println("Cadastros realizados com sucesso!");
                break;
            }
        }
        System.out.println("Cadastros: "+nameClient.toString());
        System.out.println("Tipos de gasolina utilizados: "+typeofGas.toString());
    }
}
