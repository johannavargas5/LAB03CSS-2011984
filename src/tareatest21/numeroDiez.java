package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroDiez {

  /**
   * Prueba que el método lance una excepción NullPointerException cuando la lista es nula.
   */
  @Test
  public void add_nullList_throwsNullPointerException() {
    assertThrows(NullPointerException.class, () -> tarea.add(null));
  }

  /**
   * Prueba que el método devuelva cero cuando la lista está vacía.
   */
  @Test
  public void add_emptyList_returnsZero() {
    List<Integer> numbers = new ArrayList<>();
    int expectedSum = 0;

    int actualSum = tarea.add(numbers);

    assertEquals(expectedSum, actualSum);
  }

  /**
   * Prueba que el método devuelva el elemento de la lista cuando la lista tiene un elemento.
   */
  @Test
  public void add_listOneElement_returnsElement() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    int expectedSum = 1;

    int actualSum = tarea.add(numbers);

    assertEquals(expectedSum, actualSum);
  }

  /**
   * Prueba que el método devuelva la suma de los elementos de la lista cuando la lista tiene varios elementos.
   */
  @Test
  public void add_listMultipleElements_returnsSumOfElements() {
    // Se comprueba que el ArrayList no sea nulo antes de añadirlo al ArrayList
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    int expectedSum = 6;

    if (numbers != null) {
      int actualSum = tarea.add(numbers);

      assertEquals(expectedSum, actualSum);
    }
  }

}
