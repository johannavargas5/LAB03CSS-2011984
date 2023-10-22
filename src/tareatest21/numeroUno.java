package tareatest21;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class numeroUno {

    @Test
    public void testAddFirstNumbersExceptionPositive() {
        int result = addFirstNumbersException(5);
        assertEquals(15, result); // Asegura que la suma es correcta
    }

    @Test
    public void testAddFirstNumbersExceptionZero() {
        int result = addFirstNumbersException(0);
        assertEquals(0, result); // Asegura que el resultado es 0
    }

    @Test
    public void testAddFirstNumbersExceptionNegative() {
        try {
            int result = addFirstNumbersException(-2);
            fail("Debería haber lanzado una excepción ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("No ingresar números menores a 0", e.getMessage()); // Asegura que el mensaje de excepción sea el esperado
        }
    }

    @Test
    public void testAddFirstNumbersExceptionLargeInput() {
        int result = addFirstNumbersException(1000);
        assertEquals(500500, result); // Asegura que la suma sea correcta para un número grande
    }

    public static int addFirstNumbersException(int n) throws ArithmeticException {
        if (n < 0)
            throw new ArithmeticException("No ingresar números menores a 0");
        if (n == 0)
            return 0;
        else
            return n + addFirstNumbersException(n - 1);
    }
}