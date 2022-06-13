// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to modify.
// - The word parameter should also be a string that will be written to the file as individual lines.
// - The number parameter should describe how many lines the file should have.

// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'.
// The function should not raise any errors if it could not write the file.
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;

public class WriteMultipleLines {
  public static void main(String[] args) {



method("Apple", 5, "out.txt");
  }
  public static void method(String word, int number, String filepath){
    List<String> content = new ArrayList();
    content.add(word);
    Path path = Paths.get(filepath);
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < number; i++) {
      s.append(word).append("\n");


    try {

      Files.writeString(path, s);

    }catch (IOException e) {
      System.out.println("Uh-oh, could not write the file!");
  }
}}}
