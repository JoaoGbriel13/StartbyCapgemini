package IMC;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("##.##");

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.79f);

        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(scan.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(scan.nextFloat());

        System.out.println("IMC = " + dm.format(objetoPessoa.calcularIMC()));
    }
}
