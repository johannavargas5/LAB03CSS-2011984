package tareatest21;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class numeroTres {

    @Test
    // Entrada n igual a 0 y como resultado sería 0.
    public void testCalculateCubeWithZero() {
        int result = tarea.calculateCube(0);
        assertEquals(0, result);
    }

    @Test
    // Entrada n igual a un número positivo (5) y como resultado sería 125.
    public void testCalculateCubeWithPositiveNumber() {
        int result = tarea.calculateCube(5);
        assertEquals(125, result);
    }

    @Test
    // Entrada n igual a un número negativo (-3) y como resultado sería -27.
    public void testCalculateCubeWithNegativeNumber() {
        int result = tarea.calculateCube(-3);
        assertEquals(-27, result);
    }

    @Test
    // Entrada n igual a Integer.MAX_VALUE (el valor máximo de un entero en Java) y como resultado sería el cubo de Integer.MAX_VALUE.
    public void testCalculateCubeWithMaxValue() {
        int result = tarea.calculateCube(Integer.MAX_VALUE);
        assertEquals(2147483647, result);
    }
}
