package tareatest21;

import java.util.StringTokenizer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numeroCinco {

    public static String reverseWord(String str) {

        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            if (tokenizer.hasMoreTokens()) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    @Test
    public void testReverseWord_stringVacio() {
        // Prueba cuando la cadena está vacía
        // Entrada: str = ""
        // Salida esperada: ""
        String str = "";
        String resultadoEsperado = "";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_unaPalabra() {
        // Prueba cuando hay una sola palabra en la cadena
        // Entrada: str = "hola"
        // Salida esperada: "aloh"
        String str = "hola";
        String resultadoEsperado = "aloh";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_variasPalabras() {
        // Prueba cuando hay varias palabras en la cadena
        // Entrada: str = "hola mundo"
        // Salida esperada: "aloh odnum"
        String str = "hola mundo";
        String resultadoEsperado = "aloh odnum";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_conEspaciosEnBlanco() {
        // Prueba cuando la cadena tiene espacios en blanco al inicio y al final
        // Entrada: str = "  hola mundo  "
        // Salida esperada: "  aloh odnum  "
        String str = "  hola mundo  ";
        String resultadoEsperado = "  aloh odnum  ";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
