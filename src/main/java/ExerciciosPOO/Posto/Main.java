package ExerciciosPOO.Posto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel posto = new BombaCombustivel(4.75f, 1000);
        Scanner scan = new Scanner(System.in);
        DecimalFormat dm = new DecimalFormat("###.##");

        char repetir = 's';

        while(repetir == 's' || repetir == 'S'){
            //Checar se a bomba ainda possui gasolina:
            if(posto.getQtdAbastecimento() <= 0){
                System.out.println("A quantidade de combustivel da bomba acabou!");
                repetir = 'n';
            }

            //Checar o tipo de combustivel
            System.out.println("Qual o tipo de combustivel deseja colocar?");
            String tipo = scan.next();
            posto.alterarTipo(tipo);
            System.out.println(posto.getTipoCombustivel());

            //Alterando o valor de acordo com o tipo
            posto.alterarValor();
            System.out.println("O valor por litro é de " + posto.getValorporLitro());

            //Abastecimento por valor em dinheiro
            System.out.println("Digite o valor em dinheiro que quer colocar: ");
            int valorEmDinheiro = scan.nextInt();
            float totalCombustivel = posto.abastecerPorValor(valorEmDinheiro);
            System.out.println("O total é de: " + dm.format(totalCombustivel) + " litros");

            //Diminuindo bomba de acordo com o que foi abastecido em litros
            posto.diminuirBomba(totalCombustivel);
            System.out.println("A quantidade de combustivel restante é de " + dm.format(posto.getQtdAbastecimento()));

            //Abastecimento de acordo com a quantidade em litros
            System.out.println("Digite a quantidade de combustivel em litros que deseja colocar: ");
            float valorEmLitros = scan.nextFloat();
            System.out.println("O total em dinheiro é de: R$ " + dm.format(posto.abastecerPorLitro(valorEmLitros)));

            //Diminuindo a bomba de acordo com a quantidade em litros
            posto.diminuirBomba(valorEmLitros);
            System.out.println("A quantidade de combustivel restante é de " + dm.format(posto.getQtdAbastecimento()));

            //Checando se deseja continuar
            System.out.println("Deseja continuar? S - Sim e N - Não");
            repetir = scan.next().charAt(0);

        }
    }
}
