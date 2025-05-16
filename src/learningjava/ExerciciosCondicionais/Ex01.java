package learningjava.ExerciciosCondicionais;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        int ran1 = (int)(Math.random()*100)+1;
        int ran2 = (int)(Math.random()*100)+1;
        System.out.println("Primeiro número: "+ran1);
        System.out.println("Segundo número: "+ran2);
        if(ran1>ran2) {
            System.out.println(ran1+" é o maior número!");
        }else {
            System.out.println(ran2+" é o maior número!!");
        };
    }
}

//Verificar qual o maior e menor número entre dois números
