package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public void atualiza(Momento inicio, Momento fim) {
        int minutosInicio = inicio.minutos();
        int minutosFim = fim.minutos();

        if (minutosInicio > minutosFim) {
            throw new IllegalStateException("inicio depois do fim");
        }

        this.inicio = inicio;
        this.fim = fim;
    }


    public int getId() {
        return id;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
