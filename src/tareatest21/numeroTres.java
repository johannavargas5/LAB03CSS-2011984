package tareatest21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class numeroTres{
	@Test
    public void testFindMaxNumber_arrayVacio() {
        // Entrada: arr = []
        // Salida esperada: -1
        int[] arr = {};
        int resultadoEsperado = -1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_unElemento() {
        // Entrada: arr = [1]
        // Salida esperada: 1
        int[] arr = {1};
        int resultadoEsperado = 1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_variosElementos() {
        //Entrada: arr = [1, 2, 3]
        //Salida esperada: 3
        int[] arr = {1, 2, 3};
        int resultadoEsperado = 3;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_todosLosElementosIguales() {
        //Entrada: arr = [1, 1, 1]
        //Salida esperada: 1
        int[] arr = {1, 1, 1};
        int resultadoEsperado = 1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
