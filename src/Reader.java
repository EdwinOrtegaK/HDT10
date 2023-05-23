import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static ArrayList Leer(){
        ArrayList<String> lineas = new ArrayList<>();
        try {
            File archivo = new File("logistica.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                lineas.add(linea);
            }

            scanner.close();

            // hacer algo con las líneas guardadas en el ArrayList
            for (String linea : lineas) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } return lineas;
    }
}
