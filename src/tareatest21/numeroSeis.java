package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroSeis {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
@test
public void pruebaCompararNumerosIguales() {
	int resultado = numeroSeis.compareTwoNumbers(3,3);
	assertEquals(0,resultado);
}


@test
public void pruebaCompararSegundoNumeroMayor() {
	int resultado = numeroSeis.compareTwoNumbers(3,5);
	assertEquals(-1,resultado);
}


@Test
public void pruebaExcepcionParaNumerosNegativos() {
    try {
        int resultado = numeroSeis.compareTwoNumbers(-2, 3);
        fail("La excepción de números negativos no se lanzó");
    } catch (IllegalArgumentException e) {
        // Verifica que la excepción lanzada sea del tipo IllegalArgumentException.
        assertEquals("Los números no pueden ser negativos", e.getMessage());
    }
}

@Test
public void pruebaExcepcionParaNumerosIguales() {
    try {
        int resultado = numeroSeis.compareTwoNumbers(4, 4);
        fail("La excepción de números iguales no se lanzó");
    } catch (ArithmeticException e) {
        // Verifica que la excepción lanzada sea del tipo ArithmeticException.
        assertEquals("Ambos números son iguales", e.getMessage());
    }
}
