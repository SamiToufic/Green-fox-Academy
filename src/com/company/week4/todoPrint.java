import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class todoPrint {
  public static void main(String... args) {

    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the `todoText`
    // Add " - Download games" to the end of the `todoText`
    // Add " - Diablo" to the end of the `todoText` applying indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo


    System.out.println("My todo:".concat(todoText).concat("-Download games\n").concat("-Diablo"));





  }}
