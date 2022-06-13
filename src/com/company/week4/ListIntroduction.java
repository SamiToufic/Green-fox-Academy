import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction {
  public static void main(String[] args) {
    List<String>names = new ArrayList<String>();
    System.out.println(names.size());
    names.add("William");

    System.out.println(names.isEmpty());

    System.out.println(names);
    names.add("John");
    names.add("Amanda");
    System.out.println(names.size());
    System.out.println(names.get(2));
    for (int i = 0; i <= names.size(); i++) {
      for (int j = 1; j <= 4; j++)
        if (i == 1 && j == 2 || i == 2 && j == 3 || i == 0 && j == 1)

          System.out.println(j + "." + names.get(i));
    }
     names.remove(1);
     System.out.println(names);

    for (int k = names.size()-1; k >= 0; k--) {
      System.out.println(names.get(k));
    }
    names.clear();

    System.out.println(names.size());
    }




    }

      



