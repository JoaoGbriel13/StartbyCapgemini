package ExerciciosPOO.Invoice;

public class Invoice {

    private int numItem;
    private String descricaoItem;
    private int qtdComprada;
    private float precoItem;

    public Invoice(int numItem, String descricaoItem, int qtdComprada, float precoItem) {
        this.numItem = numItem;
        this.descricaoItem = descricaoItem;
        this.setPrecoItem(precoItem);
        this.setQtdComprada(qtdComprada);
    }

    public double getInvoiceAmount(){
        return this.qtdComprada * this.precoItem;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        if(qtdComprada < 0){
            this.qtdComprada = 0;
        }else {
            this.qtdComprada = qtdComprada;
        }
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        if (precoItem < 0.0f){
            this.precoItem = 0.0f;
        }else{
            this.precoItem = precoItem;
        }
    }
}
