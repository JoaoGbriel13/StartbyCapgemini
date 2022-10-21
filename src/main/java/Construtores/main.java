package Construtores;

public class main {
    public static void main(String[] args) {
        //Construtor e utilizando o metodo para calcular a média
        Aluno alu = new Aluno(8,7.5,3.5);
        double media = alu.media();

        //Criação do if/else para o enum

        if(media < 7){
            alu.situacao = Aluno.STATUS.REPROVADO;
        }else {
            alu.situacao = Aluno.STATUS.APROVADO;
        }

        System.out.println("O aluno está " + alu.situacao + " Com a média de: " + media);
    }
}
