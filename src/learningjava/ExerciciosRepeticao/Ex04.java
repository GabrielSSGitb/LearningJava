package learningjava.ExerciciosRepeticao;


import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Valor inicial do composto: ");
        double mass = user.nextDouble();
        double initialMass = mass;
        int totalTime = 0;
        while(mass >= 0.5) {
            mass = mass/2;
            totalTime += 50;
        }
        int hours = totalTime/3600;
        int minutes = (totalTime % 3600) / 60;
        int seconds = totalTime%60;
        System.out.println("Usando uma massa inicial de: "+initialMass);
        System.out.printf("Em um tempo de: %02d horas, %02d minutos %02d segundos, obtemos: %.2f g\n !", hours, minutes, seconds, mass);
    }
}
/*
M/2 a cada 50s
m0 até que seja menor que 0.5 g
M(t) = M0*(1/2)t/T
t > 50*log(0.5/m0)/-log(2)
*/