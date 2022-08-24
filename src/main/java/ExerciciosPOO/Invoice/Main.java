package ExerciciosPOO.Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice inv = new Invoice(1,"Computador",-5,-2500f);
        System.out.println("O numero do item é: " + inv.getNumItem() + "\nO item comprado foi: " + inv.getDescricaoItem() + "\nA quantidade comprada foi de: " +
                inv.getQtdComprada() + "\nE o valor do item é de: " + inv.getPrecoItem());
        System.out.println("No total a compra foi de: R$" + inv.getInvoiceAmount());
    }
}
