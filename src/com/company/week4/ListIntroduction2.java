import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
  public static void main(String[] args) {
    List<String> listecek = new ArrayList<String>();
    listecek.add("Apple");
    listecek.add("Avocado");
    listecek.add("Blueberries");
    listecek.add("Durian");
    listecek.add("Lychee");
    System.out.println(listecek);
    List<String> listecek2= new ArrayList<String>(listecek);
    System.out.println(listecek.contains("Durian"));
    listecek2.remove("Durian");
    listecek.add(4,"Kiwifruit");
    boolean b = listecek.size() == listecek2.size();
    System.out.println(b);
    System.out.println((listecek.indexOf("Avocado")));
    System.out.println((listecek2.indexOf("Durian")));
    listecek2.add("Passion fruit");
    listecek2.add("Pomelo");
    System.out.println(listecek.get(2));
    System.out.println(listecek);
    System.out.println(listecek2);
  }
}
