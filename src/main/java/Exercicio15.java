import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero a ser encontrado");

        int numero = scan.nextInt();

        if(numero >= 100 && numero <= 200){
            System.out.println("Numero está entre 100 e 200!");
        }
        else{
            System.out.println("Numero não está entre 100 e 200");
        }
    }
}
