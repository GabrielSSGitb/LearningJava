package learningjava.ExerciciosCondicionais;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("=================== Calculando Médias ===================");
        System.out.print("Informe sua primeira nota:");
        float n1 = user.nextFloat();
        System.out.print("Informe sua segunda nota: ");
        float n2 = user.nextFloat();
        float media = n1+n2/2;
        
        if(media >= 7) {
            System.out.println("Parabéns, você foi aprovado com sucesso!!!");
            System.out.println("Sua média vale: "+media);
        }else {
            System.out.println("Você foi reprovado vagabundo!!!");
            System.out.println("Sua media vale: "+media);
        };
    }
}
