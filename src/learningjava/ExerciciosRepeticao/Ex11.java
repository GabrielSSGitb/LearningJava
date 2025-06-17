
package learningjava.ExerciciosRepeticao;

public class Ex11 {

    public static void main(String[] args) {
        // Populações iniciais
        double populacaoBruzundanga = 90000000;
        double populacaoMilano = 200000000;

        // Taxas de crescimento (em decimal)
        double taxaBruzundanga = 0.03;
        double taxaMilano = 0.015;

        // Contador de anos
        int anos = 0;

        // Loop até a população dos Bruzundangas ultrapassar ou igualar à dos Milanos
        while (populacaoBruzundanga < populacaoMilano) {
            populacaoBruzundanga += populacaoBruzundanga * taxaBruzundanga;
            populacaoMilano += populacaoMilano * taxaMilano;
            anos++;
        }

        // Exibe o resultado
        System.out.println("Serão necessários " + anos + " anos para que a população da República Democrática dos Bruzundangas ultrapasse ou iguale a população da União Federalista do Milano.");
    }
}


