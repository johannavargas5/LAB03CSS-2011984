package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroCuatro {

    public static int calculateCube(int n) {
        return n * n * n;
    }

    @Test
    public void testCalculateCube_numeroNegativo() {
        // Entrada: n = -1
        // Salida esperada: -1
        int n = -1;
        int resultadoEsperado = -1;
        int resultadoObtenido = numeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_numeroCero() {
        // Entrada: n = 0
        // Salida esperada: 0
        int n = 0;
        int resultadoEsperado = 0;
        int resultadoObtenido = numeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_numeroPositivo() {
        // Entrada: n = 1
        // Salida esperada: 1
        int n = 1;
        int resultadoEsperado = 1;
        int resultadoObtenido = numeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_numeroGrande() {
        // Entrada: n = 1000
        // Salida esperada: 1000000
        int n = 1000;
        int resultadoEsperado = 1000000;
        int resultadoObtenido = numeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
