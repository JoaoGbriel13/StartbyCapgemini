package IMC;

public class Pessoa {
    float peso;
    float altura;

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura );
        return imc;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
