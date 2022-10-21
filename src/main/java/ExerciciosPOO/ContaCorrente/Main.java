package ExerciciosPOO.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("João Gabriel", 1);
        cc.depositarValor(500f);
        cc.alterarNome("João");
        System.out.println(cc.getNome() + " o numero da conta é: " + cc.getNumeroConta());

    }
}
