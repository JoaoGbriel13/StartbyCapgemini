package ExerciciosPOO.Funcionario;

import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("João", "Gabriel", 5000);
        Funcionario fun2 = new Funcionario("João", "Gabriel", 15000);
        DecimalFormat dm = new DecimalFormat("R$ ###,###");

        double salarioFun1 = fun1.getSalarioMensal();
        System.out.println("O salario do funcionario é: " + dm.format(salarioFun1));
        double salarioAnualFun1 = fun1.salarioAnual(salarioFun1);
        System.out.println("O salario anual é de: " + dm.format(salarioAnualFun1));
        double bonusSalarioFun1 = fun1.aumentoSalarial(salarioFun1);
        System.out.println("O salario com o aumento é de: " + dm.format(bonusSalarioFun1));

        double salarioFun2 = fun2.getSalarioMensal();
        System.out.println("O salario do funcionario é: " + dm.format(salarioFun2));
        double salarioAnualFun2 = fun1.salarioAnual(salarioFun2);
        System.out.println("O salario anual é de: " + dm.format(salarioAnualFun2));
        double bonusSalarioFun2 = fun1.aumentoSalarial(salarioFun2);
        System.out.println("O salario com o aumento é de: " + dm.format(bonusSalarioFun2));
    }
}
