package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;
    private int minutosDia = 24*60;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public void atualiza(int ano, int mes, int dia){
        this.ano = ajusta(1970,2070,ano);
        this.mes = ajusta(1,12,mes);
        this.dia = ajusta(1,limite.get(this.mes),dia);


    }

    private int minutosEmUmAno(){
        int i =1;
        int minutosAno = 0;
        while(i <= 12){
            minutosAno += limite.get(i) * this.minutosDia;
            i++;

        }

        return minutosAno;
    }

    private int minutosAteMes(int dia, int mes){

        int i =1;
        int minutosAte = 0;

        while(i < mes){
            minutosAte += limite.get(i) * this.minutosDia;
            i++;
        }
        minutosAte += this.minutosDia*(dia-1);
        return minutosAte;
    }

    @Override
    public int minutos() {
        int minutos = 0;
        int deltaAno = this.ano - 1970;
        minutos += this.minutosEmUmAno()*deltaAno;
        minutos += this.minutosAteMes(this.dia, this.mes);
        return minutos;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
