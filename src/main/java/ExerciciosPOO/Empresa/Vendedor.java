package ExerciciosPOO.Empresa;

public class Vendedor extends Funcionario {
    private int totalItensVendidos;
    private float comissaoPorItens;

    public Vendedor() {
        super();
    }

    public float calculaSalario(){
        return super.getSalario() + (totalItensVendidos * comissaoPorItens);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItens() {
        return comissaoPorItens;
    }

    public void setComissaoPorItens(float comissaoPorItens) {
        this.comissaoPorItens = comissaoPorItens;
    }
}
