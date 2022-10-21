package ExerciciosPOO.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Digite o nome da pessoa: ");
        p.setName(scan.nextLine());
        System.out.println("Digite sua data de nascimento: ");
        p.setDataNascimento(scan.nextLine());
        System.out.println("Digite a sua altura: ");
        p.setAltura(scan.nextFloat());
        int idade = p.calcularIdade(p.getDataNascimento());
        p.imprimirDados(p.getName(), p.getDataNascimento(), p.getAltura(), idade);

    }
}
