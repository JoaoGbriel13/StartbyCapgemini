package ExerciciosPOO.Funcionario;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual(double salarioMensal){
        return salarioMensal * 12;
    }

    public double aumentoSalarial(double salarioMensal){
        return salarioMensal + (salarioMensal * 0.10d);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        if(this.salarioMensal <= 0){
            this.salarioMensal = 0.0d;
        }
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {

    }
}
