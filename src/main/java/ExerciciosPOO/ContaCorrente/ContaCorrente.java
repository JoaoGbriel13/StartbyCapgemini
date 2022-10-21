package ExerciciosPOO.ContaCorrente;

public class ContaCorrente {
    private String nome;
    private int numeroConta;
    private float saldo;

    public ContaCorrente(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0.0f;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void depositarValor(float valor){
        saldo+=valor;
    }

    public void sacarValor(float valor){
        if(saldo < valor){
            System.out.println("Não foi possivel realizar o saque, pois o valor excede o saldo atual da conta.");
        }else{
            saldo-=valor;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
