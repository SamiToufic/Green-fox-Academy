import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTesting {
  public static void main(String[] args) {
    HashMap<String, String> mapicka = new HashMap<String, String>();
    mapicka.put("978-1-60309-452-8", "A Letter to Jo");
    mapicka.put("978-1-60309-459-7", "Lupus");
    mapicka.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    mapicka.put("978-1-60309-461-0", "The Lab");
    for (Map.Entry<String, String> entry : mapicka.entrySet()) {
      String k = entry.getKey();
      String v = entry.getValue();
      System.out.println(v + " (ISBN " + k + ")");
    }

    mapicka.values().remove("The Lab");
    mapicka.keySet().remove("978-1-60309-444-3");





  }} // CR: formatting