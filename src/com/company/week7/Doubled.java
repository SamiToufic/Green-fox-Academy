import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) throws IOException {
decryptedDouble("duplicated-chars.txt");


  }
  public static void decryptedDouble(String filename){
    Path filePath = Paths.get(filename);
    try {
      StringBuilder encrpt = new StringBuilder();
      List<String> lines = Files.readAllLines(filePath);
      for (String line: lines) {
        for (int i = 0; i < line.length(); i++) {
          if (i % 2 == 0) {
            encrpt.append(line.charAt(i));
          }
        }
        encrpt.append("\n");
      }




    storage(encrpt.toString(), "./duplicated-chars-output.txt");
  }catch (IOException e){
      System.out.println("File is not available!");}}
  static void storage(String text, String path) {
    try {

      FileWriter writer = new FileWriter(path);
      writer.write(text);
      writer.close();
    } catch (IOException e) {
      System.out.println("Problem with saving the file ".concat(e.getMessage()));
    }
  }
}
