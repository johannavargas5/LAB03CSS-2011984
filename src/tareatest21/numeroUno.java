package tareatest21;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroUno {

	@Test
public void addFirstNumbersException_zero_returnsZero() {
  int n = 0;
  int expectedSum = 0;

  int actualSum = ejemplo.addFirstNumbersException(n);

  assertEquals(expectedSum, actualSum);
}

@Test
public void addFirstNumbersException_zero_returnsZero() {
  int n = 1;
  int expectedSum = ;

  int actualSum = ejemplo.addFirstNumbersException(n);

  assertEquals(expectedSum, actualSum);
}

}


 @Test
 public   void testAddFirstNumbersExceptionNegative() {
        assertThrows(ArithmeticException.class, () -> {
            ejemplo.addFirstNumbersException(-3);
        });
    }