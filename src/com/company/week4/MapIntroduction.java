import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    System.out.println(map.isEmpty());
    map.put(97, "a");
    map.put(98, "b");
    map.put(99, "c");
    map.put(65, "A");
    map.put(66, "B");
    map.put(67, "C");
    System.out.println(map.values());
    System.out.println(map.keySet());
    map.put(68, "D");

    // CR: be careful about formatting you could get lost easy this way
      System.out.println(map.size());
      System.out.println(map.get(99));
      map.remove(97);
      System.out.println(map);
    System.out.println(map.get(100));
    map.clear();
    System.out.println(map.size());

    }
  }

