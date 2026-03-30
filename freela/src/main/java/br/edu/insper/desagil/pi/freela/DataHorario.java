package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data){
        this.data = data;
        this.hora = 0;
        this.minuto = 0;
    }

    public void atualiza(int hora, int minuto){
        this.hora = ajusta(0,23,hora);
        this.minuto = ajusta(0,59,minuto);
    }

    @Override
    public int minutos() {
        int minutos = data.minutos();
        minutos+= this.hora*60;
        minutos+= this.minuto;

        return minutos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
