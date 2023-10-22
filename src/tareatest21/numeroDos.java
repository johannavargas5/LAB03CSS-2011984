package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroDos {

    @Test
    // Prueba para verificar si la función findHighestNumber encuentra el número más alto en el caso 1
    public void testFindHighestNumberCase1() {
        int result = tarea.findHighestNumber(3, 5, 9);
        assertEquals(9, result);
    }

    @Test
    // Prueba para verificar si la función findHighestNumber encuentra el número más alto en el caso 2
    public void testFindHighestNumberCase2() {
        int result = tarea.findHighestNumber(10, 5, 1);
        assertEquals(10, result);
    }

    @Test
    // Prueba para verificar si la función findHighestNumber encuentra el número más alto en el caso 3
    public void testFindHighestNumberCase3() {
        int result = tarea.findHighestNumber(4, 12, 8);
        assertEquals(12, result);
    }

    @Test
    // Prueba para verificar si la función findHighestNumber lanza una excepción cuando se pasan números iguales
    public void testFindHighestNumberCase4() {
        assertThrows(IllegalArgumentException.class, () -> {
            tarea.findHighestNumber(4, 4, 4);
        });
    }
}
