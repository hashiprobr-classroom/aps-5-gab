package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;
    @BeforeEach
    public void setUp() {
        this.data = new Data();

    }

    @Test
    public void constroi() {
        assertEquals(1970,data.getAno());
        assertEquals(1,data.getMes());
        assertEquals(1,data.getDia());

    }

    @Test
    public void dataBaixa() {
        data.atualiza(1969,0,0);
        assertEquals(1970,data.getAno());
        assertEquals(1,data.getMes());
        assertEquals(1,data.getDia());

    }

    @Test
    public void dataAlta() {
        data.atualiza(2071,13,32);
        assertEquals(2070,data.getAno());
        assertEquals(12,data.getMes());
        assertEquals(31,data.getDia());
        assertEquals(53084160,data.minutos());

    }
}
