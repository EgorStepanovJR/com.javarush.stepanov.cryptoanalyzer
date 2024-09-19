import java.io.*;

public class FileManager {

    public static String readFile(String filename) throws IOException {
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();

            while (line != null) {
                text.append(line).append("\n");
            }
        }

        return text.toString();
    }

    public static void writeFile(String filename, String content) throws IOException {

        try (FileWriter writer = new FileWriter("src/FileLibrary/" + filename)) {
            writer.write(content);
        }
    }
}
