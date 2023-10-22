package tareatest21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class numeroTres{

    public static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    @Test
    public void testFindMaxNumber_arrayVacio() {
        // Entrada: arr = []
        // Salida esperada: -1
        // Este caso de prueba verifica que el método `findMaxNumber()` devuelva -1 cuando el arreglo esté vacío.
        int[] arr = {};
        int resultadoEsperado = -1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_unElemento() {
        // Entrada: arr = [1]
        // Salida esperada: 1
        // Este caso de prueba verifica que el método `findMaxNumber()` devuelva el valor del único elemento del arreglo.
        int[] arr = {1};
        int resultadoEsperado = 1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_variosElementos() {
        // Entrada: arr = [1, 2, 3]
        // Salida esperada: 3
        // Este caso de prueba verifica que el método `findMaxNumber()` devuelva el valor del elemento más grande del arreglo.
        int[] arr = {1, 2, 3};
        int resultadoEsperado = 3;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testFindMaxNumber_todosLosElementosIguales() {
        // Entrada: arr = [1, 1, 1]
        // Salida esperada: 1
        // Este caso de prueba verifica que el método `findMaxNumber()` devuelva el valor de cualquier elemento del arreglo cuando todos los elementos sean iguales.
        int[] arr = {1, 1, 1};
        int resultadoEsperado = 1;
        int resultadoObtenido = tarea.findMaxNumber(arr);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
