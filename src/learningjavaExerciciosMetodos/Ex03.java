package learningjavaexerciciosmetodos;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada do usuário
        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = input.nextInt();

        // Variáveis passadas como arrays de tamanho 1 (simulando passagem por referência)
        int[] horas = new int[1];
        int[] minutos = new int[1];
        int[] segundos = new int[1];

        // Chamada da sub-rotina
        converterSegundos(totalSegundos, horas, minutos, segundos);

        // Exibir resultado
        System.out.println(totalSegundos + " segundos equivalem a: " + 
                           horas[0] + " hora(s), " + 
                           minutos[0] + " minuto(s) e " + 
                           segundos[0] + " segundo(s).");

        input.close();
    }

    // ? Sub-rotina que faz a conversão
    public static void converterSegundos(int totalSegundos, int[] horas, int[] minutos, int[] segundos) {
        horas[0] = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        minutos[0] = resto / 60;
        segundos[0] = resto % 60;
    }
}
