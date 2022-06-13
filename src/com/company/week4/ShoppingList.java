import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
  public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<String>();
    shoppingList.add("eggs");
    shoppingList.add("milk");
    shoppingList.add("fish");
    shoppingList.add("apples");
    shoppingList.add("bread");
    shoppingList.add("chicken");




    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    boolean b = shoppingList.contains("milk");
    boolean c = shoppingList.contains("bananas");
    String Y = "yes";
    String N = "No";

    // CR: same as before
    if (name.equalsIgnoreCase("Do we have milk in the shopping list?")){
      if (b== true)
      System.out.println(Y);

  // CR: formatting
  }
    // CR: same as before
    else if(name.equalsIgnoreCase("Do we have bananas in the shopping list?")){
      if (c== false)
      System.out.println(N);

    else {
      System.out.println("");
    }
}}}// CR: formatting