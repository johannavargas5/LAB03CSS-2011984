package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

<<<<<<< HEAD
class NumeroDiez {

=======
class numeroDiez {
//Diego 7w7
>>>>>>> ecd2e5f064ca80312130c8a42a09531a34b4b89a
  @TestFactory
  // Prueba que el método add() lance una excepción NullPointerException cuando la lista es nula.
  Stream<DynamicTest> add_nullList_throwsNullPointerException() {
    return Stream.of(
        DynamicTest.dynamicTest("Null list", () -> assertThrows(NullPointerException.class, () -> numeroDiez.add(null))),
        DynamicTest.dynamicTest("Empty list", () -> assertThrows(NullPointerException.class, () -> numeroDiez.add(new ArrayList<>())))
    );
  }

  @TestFactory
  // Prueba que el método add() devuelva el elemento de la lista cuando la lista tiene un elemento.
  Stream<DynamicTest> add_listMultipleElements_returnsSumOfElements() {
    return Stream.of(
        DynamicTest.dynamicTest("List with one element", () -> {
          List<Integer> numbers = new ArrayList<>();
          numbers.add(1);

          int expectedSum = 1;
          int actualSum = numeroDiez.add(numbers);

          assertEquals(expectedSum, actualSum);
        }),
        DynamicTest.dynamicTest("List with multiple elements", () -> {
          List<Integer> numbers = new ArrayList<>();
          numbers.add(1);
          numbers.add(2);
          numbers.add(3);

          int expectedSum = 6;
          int actualSum = numeroDiez.add(numbers);

          assertEquals(expectedSum, actualSum);
        }),
        DynamicTest.dynamicTest("List with negative elements", () -> {
          List<Integer> numbers = new ArrayList<>();
          numbers.add(-1);
          numbers.add(-2);
          numbers.add(-3);

          int expectedSum = -6;
          int actualSum = numeroDiez.add(numbers);

          assertEquals(expectedSum, actualSum);
        })
    );
  }

  @TestFactory
  // Prueba que el método add() lance una excepción NullPointerException cuando la lista tiene elementos nulos.
  Stream<DynamicTest> add_listWithNullElements_throwsNullPointerException() {
    return Stream.of(
        DynamicTest.dynamicTest("List with one null element", () -> {
          List<Integer> numbers = new ArrayList<>();
          numbers.add(null);

          assertThrows(NullPointerException.class, () -> numeroDiez.add(numbers));
        }),
        DynamicTest.dynamicTest("List with multiple null elements", () -> {
          List<Integer> numbers = new ArrayList<>();
          numbers.add(null);
          numbers.add(null);
          numbers.add(null);

          assertThrows(NullPointerException.class, () -> numeroDiez.add(numbers));
        })
    );
  }

  @TestFactory
  //Prueba que el método add() lance una excepción NullPointerException cuando la lista tiene todos sus elementos nulos.
  Stream<DynamicTest> add_listWithAllElementsNull_throwsNullPointerException() {
    return Stream.of(
      DynamicTest.dynamicTest("List with all null elements", () -> {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);

        assertThrows(NullPointerException.class, () -> numeroDiez.add(numbers));
      })
    );
  }

}
