package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o seu nome: ");
        String nome = scan.next();
        System.out.println("Informe a nota do primeiro trimestre: ");
        double n1 = scan.nextDouble();
        System.out.println("Informe a nota do segundo trimestre: ");
        double n2 = scan.nextDouble();
        System.out.println("Informe a nota do terceiro trimestre: ");
        double n3 = scan.nextDouble();

        double media = (n1+n2+n3)/3;
        DecimalFormat df = new DecimalFormat("#.##");

        if(media >= 7d){
            System.out.println(String.format("Aluno: " + nome + " aprovado com a nota : " + df.format(media)));
        }
        else if (media > 5d && media <7d) {
            System.out.println(String.format("Aluno: " + nome + " em recuperação com a nota : " + df.format(media)));
        }
        else{
            System.out.println(String.format("Aluno: " + nome + " reprovado com a nota : " + df.format(media)));
        }


    }
}
