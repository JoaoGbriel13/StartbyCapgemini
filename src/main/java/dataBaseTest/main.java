package dataBaseTest;

public class main {
    public static void main(String[] args){
        PessoaDAO pd = new PessoaDAO();
        Pessoa p1 = new Pessoa("Joao", 23, "Pernambuco", "70395561469");
        Pessoa p2 = new Pessoa("Amelia", 28, "São Paulo", "20290925528");
        pd.cadastarPessoa(p1);
        pd.cadastarPessoa(p2);
    }
}
