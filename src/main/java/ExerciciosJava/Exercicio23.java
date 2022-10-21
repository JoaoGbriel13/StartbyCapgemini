package ExerciciosJava;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja verificar"));
       verificarNumero(numero);
    }

    public static void verificarNumero(int numero){
     if(numero < 25){
         System.out.println("Esse numero é menor que 25");
     }else{
         System.out.println("Esse numero é maior que 25");
     }

     if (numero == 40){
         System.out.println("Esse numero é igual a 40");
     }else {
         System.out.println("Esse numero não é igual a 40");
     }

        if (numero > 80){
            System.out.println("Esse numero é maior que 80");
        }else {
            System.out.println("Esse numero é menor que 80");
        }
    }
}

