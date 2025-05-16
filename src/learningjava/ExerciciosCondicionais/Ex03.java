package learningjava.ExerciciosCondicionais;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("=================== Calculando Médias ===================");
        System.out.print("Informe sua primeira nota:");
        float n1 = user.nextFloat();
        System.out.print("Informe sua segunda nota: ");
        float n2 = user.nextFloat();
        System.out.print("Informe sua terceira nota: ");
        float n3 = user.nextFloat();
        float media = n1+n2+n3/3;
        mediaDe03(media);
    }
    private static void mediaDe03(float media) {
        if(media >= 0 && media < 3) {
            System.out.println("Reprovado!!!");
            System.out.println("Sua media vale: "+media);
        }else if(media >=3 && media < 7) {
            System.out.println("Exame");
            System.out.println("Sua media vale: "+media);
        }else {
            System.out.println("Aprovado!!!");
            System.out.println("Sua media vale: "+media);
        };
    };
}
