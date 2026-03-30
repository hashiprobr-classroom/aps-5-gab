package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private Data data;
    private DataHorario dataHorario;

    @BeforeEach
    public void setUp() {
        this.data = new Data();
        this.dataHorario = new DataHorario(this.data);

    }
    @Test
    public void constroi() {
        assertEquals(0, dataHorario.getMinuto());
        assertEquals(0, dataHorario.getHora());
        assertEquals(0, dataHorario.minutos());

    }

    @Test
    public void horarioBaixo() {
        dataHorario.atualiza(-1,-1);
        assertEquals(0, dataHorario.getMinuto());
        assertEquals(0, dataHorario.getHora());
        assertEquals(0, dataHorario.minutos());

    }

    @Test
    public void horarioAlto() {
        dataHorario.atualiza(24,60);
        assertEquals(59, dataHorario.getMinuto());
        assertEquals(23, dataHorario.getHora());
        assertEquals(1439, dataHorario.minutos());

    }
}
