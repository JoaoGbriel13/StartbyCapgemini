package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios3e4 {
    public static void main(String[] args) {
        //Exercicio 3 :
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida: ");
        double dist = scan.nextDouble();
        System.out.println("Digite o gasto de combustivel: ");
        double gasto = scan.nextDouble();

        double media = dist / gasto;
        DecimalFormat dm = new DecimalFormat("###.##");

        System.out.println("O consumo médio de combustivel foi de " + dm.format(media) + " litros");

        //Exercicio 4 :
        System.out.println("Digite o nome do vendedor: ");
        String nome = scan.next();
        System.out.println("Digite o salário fixo do vendedor");
        double salario = scan.nextDouble();
        System.out.println("Digite o total de vendas efetuadas");
        double vendas = scan.nextDouble();

        double salarioFinal = salario + (vendas * 0.15);

        System.out.println("O vendedor: " + nome + " tem um salário fixo de: " + salario + " E um salário final de: " + dm.format(salarioFinal));

    }
}
