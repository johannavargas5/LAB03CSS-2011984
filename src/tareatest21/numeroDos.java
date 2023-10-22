package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroDos {

	@Test
    public void testFindHighestNumberCase1() {
        int result = tarea.findHighestNumber(3, 5, 9);
        assertEquals(9, result);
    }

    @Test
    public void testFindHighestNumberCase2() {
        int result = tarea.findHighestNumber(10, 5, 1);
        assertEquals(10, result);
    }

    @Test
    public void testFindHighestNumberCase3() {
        int result = tarea.findHighestNumber(4, 12, 8);
        assertEquals(12, result);
    }

    @Test
    public void testFindHighestNumberCase4() {
        assertThrows(IllegalArgumentException.class, () -> {
            tarea.findHighestNumber(4, 4, 4);
        });
    }
}

