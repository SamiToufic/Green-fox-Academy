import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


public class ReversedLine {

    public static void main(String[] args) {
      Path filePath = Paths.get("./reversed-lines.txt");
      try {
        StringBuilder s = new StringBuilder();
        List<String> lines = Files.readAllLines(filePath);
        for (String file : lines) {
          for (int i = file.length() - 1; i >= 0; i--) {

            s.append(file.charAt(i));
          }
          s.append("\n");
        }System.out.println(s);


        } catch(IOException e) {
        System.out.println("Uh-oh, could not read the file!");

      }}}
