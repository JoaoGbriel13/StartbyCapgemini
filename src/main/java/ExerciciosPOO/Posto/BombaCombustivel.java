package ExerciciosPOO.Posto;

import java.util.Objects;

public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorporLitro;
    private float qtdAbastecimento;

    public BombaCombustivel(float valorporLitro, int qtdAbastecimento) {
        this.valorporLitro = valorporLitro;
        this.qtdAbastecimento = qtdAbastecimento;
    }

    public float abastecerPorValor(int valorTotal){
        return valorTotal / this.valorporLitro;
    }

    public float abastecerPorLitro(float totalLitros){
        if(totalLitros > this.qtdAbastecimento){
            System.out.println("A quantidade de combustivel não pode ser maior que a capacidade do tanque!");
        }
        return totalLitros * this.valorporLitro;
    }

    public float alterarValor(){
        if(Objects.equals(this.tipoCombustivel, "Gasolina".toLowerCase())){
            this.valorporLitro = 5.65f;
        } else if (Objects.equals(this.tipoCombustivel, "Alcool".toLowerCase())) {
          this.valorporLitro = 5.25f;
        }else{
            this.valorporLitro = valorporLitro;
        }
        return this.valorporLitro;
    }

    public String alterarTipo(String novoCombustivel){
        this.tipoCombustivel = novoCombustivel;
        return novoCombustivel;
    }

    public float diminuirBomba(float bombaCombustivel){
        this.qtdAbastecimento = this.qtdAbastecimento - bombaCombustivel;
        return this.qtdAbastecimento;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorporLitro() {
        return valorporLitro;
    }

    public void setValorporLitro(float valorporLitro) {
        this.valorporLitro = valorporLitro;
    }

    public float getQtdAbastecimento() {
        return qtdAbastecimento;
    }

    public void setQtdAbastecimento(int qtdAbastecimento) {
        this.qtdAbastecimento = qtdAbastecimento;
    }
}
