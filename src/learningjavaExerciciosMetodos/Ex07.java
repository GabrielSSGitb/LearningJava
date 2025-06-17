package learningjavaexerciciosmetodos;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada da hora de início
        System.out.print("Digite a hora de início (0-23): ");
        int horaInicio = input.nextInt();

        System.out.print("Digite os minutos de início (0-59): ");
        int minutoInicio = input.nextInt();

        // Entrada da hora de término
        System.out.print("Digite a hora de término (0-23): ");
        int horaFim = input.nextInt();

        System.out.print("Digite os minutos de término (0-59): ");
        int minutoFim = input.nextInt();

        // Chamada da sub-rotina
        int duracaoMinutos = calcularDuracaoEmMinutos(horaInicio, minutoInicio, horaFim, minutoFim);

        // Saída
        System.out.println("A duração do jogo foi de " + duracaoMinutos + " minutos.");

        input.close();
    }

    // 🔥 Sub-rotina que calcula a duração em minutos
    public static int calcularDuracaoEmMinutos(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        // Converter tudo para minutos
        int totalMinInicio = horaInicio * 60 + minutoInicio;
        int totalMinFim = horaFim * 60 + minutoFim;

        // Calcular a duração considerando a virada do dia
        if (totalMinFim >= totalMinInicio) {
            return totalMinFim - totalMinInicio;
        } else {
            return (24 * 60 - totalMinInicio) + totalMinFim;
        }
    }
}
