package ExerciciosPOO.elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasElevador;


    public void inicializar(int totalAndares, int capacidadeElevador){
        this.andarAtual = 0;
        this.pessoasElevador = 0;
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        System.out.println("Elevador iniciado!");
    }

    public void entra(int pessoas){
        if(pessoas <= capacidadeElevador){
            pessoasElevador = pessoasElevador + pessoas;
        }else
            System.out.println("O elevador já atingiu sua capacidade máxima.");{
        }
    }

    public void sair(int pessoas){
        if(pessoasElevador > 0 && pessoas <= pessoasElevador ){
            pessoasElevador = pessoasElevador - pessoas;
        }else{
            System.out.println("O elevador já está vazio.");
        }
    }

    public void sobe(){
        if(andarAtual <= totalAndares){
            andarAtual++;
        }else{
            System.out.println("O elevador já está no ultimo andar");
        }
    }

    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
        }else{
            System.out.println("O elevador está no terreo");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasElevador() {
        return pessoasElevador;
    }

    public void setPessoasElevador(int pessoasElevador) {
        this.pessoasElevador = pessoasElevador;
    }
}
