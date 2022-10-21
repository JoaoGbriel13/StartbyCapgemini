package ExerciciosPOO.elevador;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializar(5,12);
        elevador.entra(12);
        elevador.sair(12);
        System.out.println(elevador.getPessoasElevador());

    }
}
