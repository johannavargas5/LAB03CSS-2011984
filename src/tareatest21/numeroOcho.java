package tareatest21;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroOcho {

    @Test
    // Prueba el método removeDuplicates para eliminar elementos duplicados de una lista.
    public void testRemoveDuplicates() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        tarea.removeDuplicates(numbers);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        assertEquals(expected, numbers);
    }

    @Test
    // Prueba el método removeDuplicates cuando se aplica a una lista vacía.
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();

        tarea.removeDuplicates(numbers);

        assertTrue(numbers.isEmpty());
    }

    @Test
    // Prueba el método removeDuplicates cuando se aplica a una lista nula.
    public void testRemoveDuplicatesWithNullList() {
        assertThrows(NullPointerException.class, () -> tarea.removeDuplicates(null));
    }

    @Test
    // Prueba el método removeDuplicates cuando la lista contiene elementos nulos.
    public void testRemoveDuplicatesWithNullElements() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(2);
        numbers.add(null);
        numbers.add(3);

        assertThrows(NullPointerException.class, () -> tarea.removeDuplicates(numbers));
    }
}
