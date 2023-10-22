package tareatest21;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//Diego 7w7
class numeroNueve {

  // Prueba que el método `divTwoNumbers()` lance una excepción `IllegalArgumentException` cuando el divisor es 0.
  @Test
  void divTwoNumbers_divisorIsZero_throwsIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> tarea.divTwoNumbers(1, 0));
  }

  // Prueba que el método `divTwoNumbers()` devuelva el cociente de los dos números cuando el divisor no es 0.
  @Test
  void divTwoNumbers_divisorIsNotZero_returnsQuotient() {
    double expectedQuotient = 2.0;
    double actualQuotient = tarea.divTwoNumbers(4, 2);

    assertEquals(expectedQuotient, actualQuotient);
  }

  // Prueba que el método `divTwoNumbers()` devuelva el cociente de los dos números negativos cuando el divisor no es 0.
  @Test
  void divTwoNumbers_divisorIsNotZero_returnsQuotientOfNegativeNumbers() {
    double expectedQuotient = -2.0;
    double actualQuotient = tarea.divTwoNumbers(-4, 2);

    assertEquals(expectedQuotient, actualQuotient);
  }

  // Prueba que el método `divTwoNumbers()` devuelva el cociente de los dos números cuando el divisor es negativo y el dividendo es positivo.
  @Test
  void divTwoNumbers_divisorIsNegative_returnsQuotientOfPositiveAndNegativeNumbers() {
    double expectedQuotient = -2.0;
    double actualQuotient = tarea.divTwoNumbers(4, -2);

    assertEquals(expectedQuotient, actualQuotient);
  }

}
