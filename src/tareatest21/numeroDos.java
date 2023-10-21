package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroDos {

	// Test 1
    @Test
    public void testFindHighestNumberException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Operaciones.findHighestNumber(1, 2, 2);
        });
    }

    // Test 2
    @Test
    public void testFindHighestNumber() {
        int result = Operaciones.findHighestNumber(5, 2, 1);
        assertEquals(5, result);
    }

    // Test 3
    @Test
    public void testFindHighestNumberEqual() {
        int result = Operaciones.findHighestNumber(4, 4, 4);
        assertEquals(4, result);
    }

	//Test 4
    @Test 
    public void testFindHighestNumberLargeNumbers() {
        int result = Operaciones.findHighestNumber(1000, 500, 750);
        assertEquals(1000, result);
    }
}

