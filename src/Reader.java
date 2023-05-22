import java.io.*;

public class Reader {
    public static void Leer(){
        try {
            File archivo = new File("logistica.txt");
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
