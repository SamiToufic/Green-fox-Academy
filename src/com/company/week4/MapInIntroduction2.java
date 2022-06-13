import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> mapicka= new HashMap<String, String>();
    mapicka.put("978-1-60309-452-8","A Letter to Jo");
    mapicka.put("978-1-60309-459-7","Lupus");
    mapicka.put("978-1-60309-444-3","Red Panda and Moon Bear");
    mapicka.put("978-1-60309-461-0","The Lab");
    for (Map.Entry<String, String> entry : mapicka.entrySet()) {
      String k = entry.getKey();
      String v = entry.getValue();
      System.out.println(v + " (ISBN " + k + ")");}

      mapicka.values().removeIf(value -> value.contains("The Lab"));
      mapicka.keySet().removeIf(key -> key == "978-1-60309-444-3");

      System.out.println(mapicka);

    mapicka.put("978-1-60309-450-4","They Called Us Enemy");
    mapicka.put("978-1-60309-453-5","Why Did We Trust Him?");
boolean b = mapicka.get("478-0-61159-424-8")!=null;
System.out.println(b);
System.out.println(mapicka.get("978-1-60309-453-5"));
// CR: get used to formatting









    }
  }

