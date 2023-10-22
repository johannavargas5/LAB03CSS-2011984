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
            result.append(" ");
        }
        return result.toString();
    }

    @Test
    public void testReverseWord_stringVacio() {
        // Entrada: str = ""
        // Salida esperada: ""
        String str = "";
        String resultadoEsperado = "";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_unaPalabra() {
        // Entrada: str = "hola"
        // Salida esperada: "aloh"
        String str = "hola";
        String resultadoEsperado = "aloh";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_variasPalabras() {
        // Entrada: str = "hola mundo"
        // Salida esperada: "aloh dnuom"
        String str = "hola mundo";
        String resultadoEsperado = "aloh dnuom";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testReverseWord_conEspaciosEnBlanco() {
        // Entrada: str = "  hola mundo  "
        // Salida esperada: "  aloh dnuom  "
        String str = "  hola mundo  ";
        String resultadoEsperado = "  aloh dnuom  ";
        String resultadoObtenido = numeroCinco.reverseWord(str);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
