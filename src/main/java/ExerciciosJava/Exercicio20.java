package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("###.##");

        boolean continuar = true;
        int totalCarrosNovos = 0;
        int totalCarrosAntigos = 0;

        while(continuar){
            System.out.println("Qual é o ano do carro?");
            int anoCarro = scan.nextInt();
            System.out.println("Qual é o preço do carro?");
            double precoCarro = scan.nextFloat();

            if (anoCarro < 2000){
                precoCarro = precoCarro - (precoCarro * 0.12);
                System.out.println("O preço do carro com desconto é de: R$ " + dm.format(precoCarro));
                totalCarrosAntigos++;
            }else {
                precoCarro = precoCarro - (precoCarro * 0.07);
                System.out.println("O preço do carro com desconto é de: R$ " + dm.format(precoCarro));
                totalCarrosNovos++;
            }
            System.out.println("Deseja continuar?");
            String opcao = scan.next();
            if (Objects.equals(opcao, "n") || opcao == "N"){
                continuar = false;
            }

        }
        System.out.println("O total de carros até o ano 2000 é de: " + totalCarrosAntigos);
        System.out.println("O total de carros no geral é de: " + (totalCarrosNovos + totalCarrosAntigos));
    }
}
