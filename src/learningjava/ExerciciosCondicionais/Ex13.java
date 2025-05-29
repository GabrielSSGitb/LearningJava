package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("========================== Calculando um Polinomio de 2º Grau ==========================");
        System.out.print("Informe o valor de a: ");
        float a = user.nextFloat();
        System.out.print("Informe o valor de b: ");
        float b = user.nextFloat();
        System.out.print("Informe o valor de c: ");
        float c = user.nextFloat();
        float delta = (float) Math.pow(b,2)-4*a*c;
        quadratica(delta, a, b, c);
        System.out.println(delta);
    }
    public static void quadratica(float delta, float a, float b, float c) {
        if(delta < 0) {
            System.out.println("Não existem raizes reais!");
        }else if(delta == 0) {
            float x = b/(2*a);
            System.out.println("x = "+x);
        }else {
            float x1 = (float) (b+Math.sqrt(delta)/(2*a));
            float x2 = (float) (b-Math.sqrt(delta)/(2*a));
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
