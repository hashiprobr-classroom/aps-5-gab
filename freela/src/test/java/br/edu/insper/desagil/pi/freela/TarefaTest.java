package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    private Tarefa tarefa;

    @BeforeEach
    public void setUp(){
        this.tarefa= new Tarefa(1);
    }

    @Test
    public void constroi(){
        assertEquals(1,tarefa.getId());
        assertEquals("",tarefa.getDescricao());
        assertNull(tarefa.getFim());
        assertNull(tarefa.getInicio());
    }

    @Test
    public void mudaDescricao(){
        tarefa.setDescricao("descricao");
        assertEquals("descricao",tarefa.getDescricao());
    }

    @Test
    public void momentosValidos(){
        Data datainicio = new Data();
        Data datafim = new Data();
        datafim.atualiza(1971,1,1);
        tarefa.atualiza(datainicio,datafim);
        assertEquals(datainicio,tarefa.getInicio());
        assertEquals(datafim,tarefa.getFim());

    }

    @Test
    public void momentosInValidos(){
        Data datainicio = new Data();
        Data datafim = new Data();
        datainicio.atualiza(1971,1,1);
        assertThrows(IllegalStateException.class, () -> {
            tarefa.atualiza(datainicio, datafim);
        });



    }
}
