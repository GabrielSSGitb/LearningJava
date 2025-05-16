package learningjava.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("================ Verificador de Triângulos ================");
        System.out.print("Informe o valor de x do triângulo: ");
        int x = user.nextInt();
        System.out.print("Informe o valor de y do triângulo: ");
        int y = user.nextInt();
        System.out.print("Informe o valor de z do triângulo: ");
        int z = user.nextInt();
        verificaTriangulo(x,y,z);
    }

    private static void verificaTriangulo(int x, int y, int z) {
       if(x+y > z) {
           System.out.println("É possível formar o triângulo!!!");
           System.out.println("Valores: "+x+" + "+y+" + "+z);
       }else {
           System.out.println("Não é possível formar o triângulo!!!");
           System.out.println("Valores: "+x+" + "+y+" + "+z);
       }
    }
}
