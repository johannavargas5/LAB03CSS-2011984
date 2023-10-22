package tareatest21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroSiete {

	@Test
public void pruebaOrdenamientoCorrecto() {
    int[] arreglo = {5, 2, 8, 1, 9};
    int[] esperado = {1, 2, 5, 8, 9};
    tarea.sortArray(arreglo);
    
    // Utiliza assertArrayEquals para verificar que el arreglo esté ordenado correctamente.
    assertArrayEquals(esperado, arreglo);
}

    @Test
    public void pruebaOrdenamientoCambiaArreglo() {
    int[] arreglo = {5, 2, 8, 1, 9};
    int[] copiaOriginal = arreglo.clone();
    tarea.sortArray(arreglo);
    
    // Utiliza assertNotEquals para verificar que el arreglo original haya cambiado después de la ordenación.
    assertNotEquals(copiaOriginal, arreglo);
}

    @Test
    public void pruebaElementosEnOrdenAscendente() {
    int[] arreglo = {1, 2, 3, 4, 5};
    tarea.sortArray(arreglo);
    
    // Utiliza assertTrue para verificar que los elementos estén en orden ascendente.
    for (int i = 0; i < arreglo.length - 1; i++) {
        assertTrue(arreglo[i] <= arreglo[i + 1]);
    }
}

    @Test
    public void pruebaTamañoArregloInalterado() {
    int[] arreglo = {5, 2, 8, 1, 9};
    int longitudOriginal = arreglo.length;
    tarea.sortArray(arreglo);
    
    // Utiliza assertEquals para verificar que el tamaño del arreglo no cambie después de la ordenación.
    assertEquals(longitudOriginal, arreglo.length);
}

}


