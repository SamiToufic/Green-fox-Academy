import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

manipulatedMethod("Sami");
  }
  public static void manipulatedMethod(String name) {

    try {
      List<String> content = new ArrayList<String>();
      content.add(name);
      Path filePath = Paths.get("my-file.txt");
      Files.write(filePath, content);

    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }}