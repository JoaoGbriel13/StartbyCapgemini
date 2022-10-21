package ExerciciosPOO.Data;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private List<Integer> mesesCom30Dias = new ArrayList<>();
    private List<Integer> mesesCom31Dias = new ArrayList<>();

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if(ano >= 1900 && ano <= 2030){
            validarDatas(dia, mes);
            validarAnoBisexto(dia, mes);
        }
    }

    public void compararDatas(Data d1){
        if(this.dia == d1.dia && this.mes == d1.mes && this.ano == d1.ano){
            System.out.println("As datas são iguais");
        }else{
            System.out.println("As datas são diferentes");
        }
    }

    public boolean anoBisexto(){
        if((this.ano % 4 == 0) && (this.ano % 100 != 0)){
            System.out.println("O ano é bisexto!");
            return true;
        }else {
            System.out.println("O ano não é bisexto");
            return false;
        }
    }

    private void popularMeses(){
        mesesCom30Dias.add(4);
        mesesCom30Dias.add(6);
        mesesCom30Dias.add(9);
        mesesCom30Dias.add(11);

        mesesCom31Dias.add(1);
        mesesCom31Dias.add(3);
        mesesCom31Dias.add(5);
        mesesCom31Dias.add(7);
        mesesCom31Dias.add(8);
        mesesCom31Dias.add(10);
        mesesCom31Dias.add(12);
    }

    public void validarDatas(int dia, int mes){
        if(mesesCom30Dias.contains(mes)){
            if(dia < 1 && dia > 30) {
                throw new IllegalArgumentException("O mês digitado não possui mais de 30 dias!");
            }
        }

        if(mesesCom31Dias.contains(mes)){
            if(dia < 1 && dia > 31) {
                throw new IllegalArgumentException("O mês digitado não possui mais de 31 dias!");
            }
        }
    }

    public void validarAnoBisexto(int dia, int mes){
        if(anoBisexto()){
            if(mes == 2){
                if(dia < 1 && dia > 29){
                    throw new IllegalArgumentException("O mês digitado não possui mais de 29 dias");
                }
            }
        }

        if(!anoBisexto()){
            if(mes == 2){
                if(dia < 1 && dia > 28){
                    throw new IllegalArgumentException("O mês digitado não possui mais que 28 dias!");
                }
            }
        }
    }

    public void dataCompleta(Data d){
        System.out.println(d.dia + "/" + d.mes + "/" + d.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
