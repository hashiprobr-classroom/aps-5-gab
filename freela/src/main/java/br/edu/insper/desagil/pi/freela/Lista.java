package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    public Lista() {
        this.tarefas = new ArrayList<>();
    }

    public void adiciona(Tarefa tarefa) {
        int id = tarefa.getId();
        boolean existe = false;
        for (Tarefa value : this.tarefas) {
            int tarefasId = value.getId();
            if (tarefasId == id) {
                existe = true;
                break;
            }
        }
        if(existe == false) {
            this.tarefas.add(tarefa);
        }

    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
