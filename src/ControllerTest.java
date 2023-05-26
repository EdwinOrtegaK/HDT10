import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    public void testIsNumWithNumber() {
        String number = "123.45";
        assertTrue(Controller.isNum(number));
    }

    @Test
    public void testMatrixIteration() {
        // Creamos una matriz de prueba
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Redirigimos la salida estándar a un ByteArrayOutputStream para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Llamamos al método que queremos probar
        Controller.matrixIteration(matrix);

        // Obtenemos la salida capturada
        String output = outputStream.toString();

        // Restauramos la salida estándar
        System.setOut(System.out);

        // Comprobamos que la salida es la esperada
        String expectedOutput = "1 2 3 \n4 5 6 \n7 8 9 \n";
        // Reemplazar el salto de línea según el sistema operativo
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            expectedOutput = expectedOutput.replace("\n", "\r\n");
        }
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testShowCities() {
        // Creamos una lista de nodos de prueba
        ArrayList<Node> citiesNodes = new ArrayList<>();
        citiesNodes.add(new Node("City1"));
        citiesNodes.add(new Node("City2"));
        citiesNodes.add(new Node("City3"));

        // Redirigimos la salida estándar a un ByteArrayOutputStream para capturarla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Llamamos al método que queremos probar
        Controller.showCities(citiesNodes);

        // Obtenemos la salida capturada
        String output = outputStream.toString();

        // Restauramos la salida estándar
        System.setOut(System.out);

        // Comprobamos que la salida es la esperada
        String expectedOutput = "1) City1\r\n2) City2\r\n3) City3\r\n";
        assertEquals(expectedOutput, output);
    }
}