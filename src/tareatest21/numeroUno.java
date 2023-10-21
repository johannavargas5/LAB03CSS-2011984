package tareatest21;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroUno {

	@Test
public void addFirstNumbersException_zero_returnsZero() {
  int n = 0;
  int expectedSum = 0;

  int actualSum = tarea.addFirstNumbersException(n);

  assertEquals(expectedSum, actualSum);
}

@Test
public void addFirstNumbersException_zero_returnsZero() {
  int n = 2;
  int expectedSum = 3;

  int actualSum = tarea.addFirstNumbersException(n);

  assertEquals(expectedSum, actualSum);
}

}


 @Test
 public void testAddFirstNumbersExceptionNegative() {
        assertThrows(ArithmeticException.class, () -> {
            tarea.addFirstNumbersException(-3);
        });
    }