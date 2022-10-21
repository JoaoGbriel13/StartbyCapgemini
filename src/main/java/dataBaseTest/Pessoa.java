package dataBaseTest;

public class Pessoa {
    private int idTabela;
    private String nome;
    private int idade;
    private String estado;
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String estado, String cpf) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
        this.cpf = cpf;
    }

    public Pessoa(int idTabela, String nome, int idade, String estado, String cpf) {
        super();
        this.idTabela = idTabela;
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
        this.cpf = cpf;
    }

    public int getIdTabela() {
        return idTabela;
    }

    public void setIdTabela(int idTabela) {
        this.idTabela = idTabela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
