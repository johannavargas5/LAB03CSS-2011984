package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroSeis {

    @test
    public void pruebaCompararNumerosIguales() {
	int resultado = tarea.compareTwoNumbers(3,3);
	assertEquals(0,resultado);
}


    @test
    public void pruebaCompararSegundoNumeroMayor() {
	int resultado = tarea.compareTwoNumbers(3,5);
	assertEquals(-1,resultado);
}


    @Test
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
