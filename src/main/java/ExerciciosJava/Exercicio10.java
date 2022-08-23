package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double preco = scan.nextDouble();
        DecimalFormat dm = new DecimalFormat("###.##");

        for (int i = 1; i <= 5; i++){
            double precoDividido = preco / i;
            System.out.println("O valor do produto em " + i + "x é de: " + dm.format(precoDividido));
        }
    }

}
