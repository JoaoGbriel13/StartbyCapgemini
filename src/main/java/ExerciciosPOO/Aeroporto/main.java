package ExerciciosPOO.Aeroporto;

import ExerciciosPOO.Data.Data;

public class main {
    public static void main(String[] args) {
        Aeroporto aero = new Aeroporto(225, new Data(5, 2,2022));
        aero.ocuparCadeira(5);
        aero.assentoDisponivel(5);
        aero.verificarAssento();
    }
}
