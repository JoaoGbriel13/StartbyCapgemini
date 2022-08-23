package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("###.##");

        double totalCusto = 0;
        double totalVenda = 0;

        int i = 0;

        for (; i < 3; i++){
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scan.next();
            System.out.println("Digite o preço de custo do produto: ");
            float precoCusto = scan.nextFloat();
            System.out.println("Digite o preço de venda do produto: ");
            float precoVenda = scan.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;


            if(precoCusto == precoVenda){
                System.out.println("Empate");
            } else if (precoCusto < precoVenda) {
                System.out.println("Lucro");
            }else {
                System.out.println("Prejuizo");
            }



        }
        System.out.println("O total em vendas foi de: " + dm.format(totalVenda));
        System.out.println("O total em custo foi de: " + dm.format(totalCusto));
        System.out.println("A media em vendas foi de: " + dm.format(totalVenda / i));
        System.out.println("A media em custo foi de: " + dm.format(totalCusto / i));
    }
}
