package tareatest21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumeroCuatro {

    public static int calculateCube(int n) {
        return n * n * n;
    }

    @Test
    public void testCalculateCube_cero() {
        // Prueba cuando el valor de entrada es cero
        // Entrada: n = 0
        // Salida esperada: 0
        // Este caso de prueba verifica que el método `calculateCube()` devuelva 0 cuando el valor de entrada sea 0.
        int n = 0;
        int resultadoEsperado = 0;
        int resultadoObtenido = NumeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_negativo() {
        // Prueba cuando el valor de entrada es negativo
        // Entrada: n = -1
        // Salida esperada: -1
        // Este caso de prueba verifica que el método `calculateCube()` devuelva el valor absoluto del valor de entrada cuando el valor de entrada sea negativo.
        int n = -1;
        int resultadoEsperado = -1;
        int resultadoObtenido = NumeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_positivo() {
        // Prueba cuando el valor de entrada es positivo
        // Entrada: n = 1
        // Salida esperada: 1
        // Este caso de prueba verifica que el método `calculateCube()` devuelva el cubo del valor de entrada cuando el valor de entrada sea positivo.
        int n = 1;
        int resultadoEsperado = 1;
        int resultadoObtenido = NumeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testCalculateCube_numeroGrande() {
        // Prueba cuando el valor de entrada es un número grande
        // Entrada: n = 1000
        // Salida esperada: 10^6
        // Este caso de prueba verifica que el método `calculateCube()` devuelva el cubo de un número grande correctamente.
        int n = 1000;
        int resultadoEsperado = 1000 * 1000 * 1000;
        int resultadoObtenido = NumeroCuatro.calculateCube(n);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
