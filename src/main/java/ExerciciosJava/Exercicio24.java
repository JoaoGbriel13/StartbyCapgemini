package ExerciciosJava;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos numeros deseja inserir");
        int count = scan.nextInt();
        int i = 0;
        while (i < count) {
            System.out.println("Digite o numero que deseja inserir");
            int numero = scan.nextInt();
            if (numero < 0){
                System.out.println("O numero " + numero + " é negativo");
            } else if (numero == 0) {
                System.out.println("O numero " + numero + " é zero");
            }else {
                System.out.println("O numero " + numero + " é positivo");
            }
            i++;

        }
    }
}
