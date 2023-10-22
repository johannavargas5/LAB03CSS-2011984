package tareatest21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class numeroCuatro{
	@Test
    public void testCalculateCube_cero() {
        // Entrada: n = 0
        // Salida esperada: 0
        int n = 0;
        int resultadoEsperado = 0;
        int resultadoObtenido = tarea.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_negativo() {
        // Entrada: n = -1
        // Salida esperada: -1
        int n = -1;
        int resultadoEsperado = -1;
        int resultadoObtenido = tarea.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_positivo() {
        // Entrada: n = 1
        // Salida esperada: 1
        int n = 1;
        int resultadoEsperado = 1;
        int resultadoObtenido = tarea.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_numeroGrande() {
        // Entrada: n = 1000
        // Salida esperada: 10^6
        int n = 1000;
        int resultadoEsperado = 1000 * 1000 * 1000;
        int resultadoObtenido = tarea.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
