package ExerciciosJava;

import javax.swing.*;

public class Exercicio25 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        verificarNumero(numero1, numero2);
    }

    public static void verificarNumero(int numero1, int numero2){
        if(numero1 == numero2){
            System.out.println("Os numeros são iguais");
        }else {
            int numeroMaisAlto = Integer.max(numero1, numero2);
            System.out.println("Os numeros são diferentes e o numero mais alto é: " + numeroMaisAlto);
        }
    }
}
