package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeroSeis {

    @Test
    // Prueba para comparar dos números iguales
    public void pruebaCompararNumerosIguales() {
	    int resultado = tarea.compareTwoNumbers(3,3);
	    assertEquals(0,resultado);
    }

    @Test
    // Prueba para comparar cuando el segundo número es mayor que el primero
    public void pruebaCompararSegundoNumeroMayor() {
	    int resultado = tarea.compareTwoNumbers(3,5);
	    assertEquals(-1,resultado);
    }

    @Test
    // Prueba para verificar si se lanza una excepción cuando se pasan números negativos como parámetros
    public void pruebaExcepcionParaNumerosNegativos() {
        try {
            int resultado = tarea.compareTwoNumbers(-2, 3);
            fail("La excepción de números negativos no se lanzó");
        } catch (IllegalArgumentException e) {
            // Verifica que la excepción lanzada sea del tipo IllegalArgumentException.
            assertEquals("Los números no pueden ser negativos", e.getMessage());
        }
    }

    @Test
    // Prueba para verificar si se lanza una excepción cuando se pasan dos números iguales como parámetros
    public void pruebaExcepcionParaNumerosIguales() {
        try {
            int resultado = tarea.compareTwoNumbers(4, 4);
            fail("La excepción de números iguales no se lanzó");
        } catch (ArithmeticException e) {
            // Verifica que la excepción lanzada sea del tipo ArithmeticException.
            assertEquals("Ambos números son iguales", e.getMessage());
        }
    }
}
