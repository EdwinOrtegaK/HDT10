import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Reader {

    /**
     * Method reads a file
     * @param fileName
     * @return
     */
    public static ArrayList<String> Leer(String fileName) {
        ArrayList<String> fileLines = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                fileLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileLines;
    }
}
