package Empresa;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Joao");
        v.setCpf("70395561469");
        v.setSalario(1500.50f);
        v.setComissaoPorItens(15f);
        v.setTotalItensVendidos(120);
        v.setDataNascimento(new Date());

        System.out.println(v.getNome());
        System.out.println(v.calculaSalario());

        Motorista m = new Motorista();
    }
}
