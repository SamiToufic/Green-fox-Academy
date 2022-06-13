import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".

    try {
      Files.createFile(Paths.get("my-file.txt"));
    } catch (IOException e) {
      System.out.println("the file already exist");

    }
    try {
      Path filePath = Paths.get("my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.toString());
    } catch (IOException e) {
      System.out.println("I could not read the file");
    }
  }}
