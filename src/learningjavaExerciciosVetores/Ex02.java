
package learningjavaExerciciosVetores;

public class Ex02 {

    public static void main(String[] args) {
        int tamanho = 101; // de 0 até 100.000 com passo de 1000 => (100000 / 1000) + 1
        int[] valores = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            valores[i] = i * 1000;
        
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}




