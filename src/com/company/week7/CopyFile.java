// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) throws IOException{
  copyFile("./my-file", "./out");
  }
  public static void copyFile(String name, String name2) throws IOException {

boolean b= true;
if (b){
  try {
    FileInputStream sourceFile = new FileInputStream(name);
    FileOutputStream targetFile = new FileOutputStream(name2);
    int byteValue;
    while ((byteValue = sourceFile.read()) != -1) {
      targetFile.write(byteValue);
    }
    sourceFile.close();
    targetFile.close();
    System.out.println(b);

  }catch (IOException e){
    System.out.println(e);
  }

}else {
  System.out.println(!b);
  }

  }
}

