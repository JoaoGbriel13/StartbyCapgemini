package ExerciciosPOO.Aeroporto;

import ExerciciosPOO.Data.Data;

import java.util.Arrays;


public class Aeroporto {
    private int numVoo;
    private Data date;
    private String[] lugaresVazios;

    public Aeroporto(int numVoo, Data date) {
        this.numVoo = numVoo;
        this.date = date;
        this.lugaresVazios = new String[100];
    }

    public void verificarAssento(){
        for(int i = 0; i < lugaresVazios.length; i++){
            if(lugaresVazios[i] == null){
                System.out.println("O proximo lugar livre é " + i);
                return;
            }else{
                System.out.println("Nenhum lugar disponivel no vôo");
                return;
            }
        }
    }

    public boolean assentoDisponivel(int numeroCadeira) {
        for (int i = 0; i <= lugaresVazios.length; i++) {
            if (numeroCadeira == i) {
                if (lugaresVazios[i] != null) {
                    System.out.println("O assento " + i + " está ocupado");
                    return false;
                } else {
                    System.out.println("O assento " + i + " está livre!");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ocuparCadeira(int cadeira){
        if(assentoDisponivel(cadeira)){
            lugaresVazios[cadeira] = "Ocupado";
            System.out.println("Assento reservado com sucesso");
            return true;
        }else{
            throw new IllegalArgumentException("O lugar já está ocupado!");
        }
    }

    public int vagas(){
        int lugaresDisponiveis = 0;
        for (String lugaresVazio : lugaresVazios) {
            if (lugaresVazio == null) {
                lugaresDisponiveis++;
            }
        }

        return lugaresDisponiveis;
    }


    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "numVoo=" + numVoo +
                ", date=" + date +
                ", lugaresVazios=" + Arrays.toString(lugaresVazios) +
                '}';
    }
}
