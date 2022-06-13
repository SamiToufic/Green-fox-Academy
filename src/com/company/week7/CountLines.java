import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    openDocument("my-file.txt");
  }

  public static void openDocument(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> list = Files.readAllLines(filePath);
      System.out.println(list.size());
    } catch (IOException e) {
      System.out.println("0");
    }
  }
}


