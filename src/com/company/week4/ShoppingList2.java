import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingList2 {
  public static void main(String[] args) {
    Map<String, Float> products = new HashMap<String, Float>();
    Map<String, Integer> shoppingList = new HashMap<String, Integer>();
    Map<String, Integer> shoppingList2 = new HashMap<String, Integer>();

    products.put("Milk", 1.07F);
    products.put("Rice", 1.59F);
    products.put("Eggs", 3.14F);
    products.put("Cheese", 12.60F);
    products.put("Chicken Breasts", 9.40F);
    products.put("Apples", 2.31F);
    products.put("Tomato", 2.58F);
    products.put("Potato", 1.75F);
    products.put("Onion", 1.10F);

    shoppingList.put("Milk", 3);
    shoppingList.put("Rice", 2);
    shoppingList.put("Eggs", 2);
    shoppingList.put("Cheese", 1);
    shoppingList.put("Chicken Breasts", 4);
    shoppingList.put("Apples", 1);
    shoppingList.put("Tomato", 2);
    shoppingList.put("Potato", 1);


    shoppingList2.put("Rice", 1);
    shoppingList2.put("Eggs", 5);
    shoppingList2.put("Chicken Breasts", 2);
    shoppingList2.put("Apples", 1);
    shoppingList2.put("Tomato", 10);


    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    // CR: same as before
    if (name.equalsIgnoreCase("Do we have milk in the shopping list?")) {
      System.out.println(products.get("Milk") * shoppingList.get("Milk") +
          products.get("Rice") * shoppingList.get("Rice") +
          products.get("Eggs") * shoppingList.get("Eggs") +
          products.get("Cheese") * shoppingList.get("Cheese") +
          products.get("Chicken Breasts") * shoppingList.get("Chicken Breasts") +
          products.get("Apples") * shoppingList.get("Apples") +
          products.get("Tomato") * shoppingList.get("Tomato") +
          products.get("Potato") * shoppingList.get("Potato"));
    }

    // CR: same as before
    if (name.equalsIgnoreCase("How much does Alice pay?")) {
      System.out.println(products.get("Rice") * shoppingList2.get("Rice") +
          products.get("Eggs") * shoppingList2.get("Eggs") +
          products.get("Chicken Breasts") * shoppingList2.get("Chicken Breasts") +
          products.get("Apples") * shoppingList2.get("Apples") +
          products.get("Tomato") * shoppingList2.get("Tomato"));
    }
    // CR: same as before
    if (name.equalsIgnoreCase("Who buys more Rice?")) {
      boolean b = shoppingList.containsKey("Rice");
      boolean c = shoppingList2.containsKey("Rice");
      if (b == true && c == true && shoppingList.get("Rice") > shoppingList2.get("Rice")) {
        System.out.println("Bob");
      } else {
        System.out.println("");
      }
    }// CR: same as before
    if (name.equalsIgnoreCase("Who buys more Potato?")) {
      boolean d = shoppingList.containsKey("Potato");
      boolean e = shoppingList2.containsKey("Potato");
      if (d == true && e == true && shoppingList.get("Potato") > shoppingList2.get("Potato")) {
        System.out.println("Bob");
      } else if (d == true && e == false) {
        System.out.println("Bob");
      } else
        System.out.println("");
    }// CR: same as before
    if (name.equalsIgnoreCase("Who buys more Ham?")) {
      boolean k = shoppingList.containsKey("Ham");
      boolean j = shoppingList2.containsKey("Ham");
      if (k == true && j == true && shoppingList.get("Potato") > shoppingList2.get("Potato")) {
        System.out.println("Bob");
      } else if (k == true && j == false) {
        System.out.println("Bob");
      } else if (k == false && j == false) {
        System.out.println("No one");
      } else {
        System.out.println("");


      }
    }// CR: same as before
    if (name.equalsIgnoreCase("Who buys more Apples?")) {
      boolean m = shoppingList.containsKey("Apples");
      boolean n = shoppingList2.containsKey("Apples");
      if (m == true && n == true && shoppingList.get("Apples") > shoppingList2.get("Apples")) {
        System.out.println("Bob");
      } else if (m == true && n == true &&
          shoppingList.get("Apples") == shoppingList2.get("Apples")) {
        System.out.println("No one");
      } else if (m == true && n == false) {
        System.out.println("Bob");
      } else if (m == false && n == false) {
        System.out.println("No one");
      } else {
        System.out.println("");

      }
    }
    if (name.equalsIgnoreCase("Who buys more of different products?")) {
      if (shoppingList.size() > shoppingList2.size()) {
        System.out.println("Bob");
      } else {
        System.out.println("Alice");
      }
    }
    // CR: same as before
    if (name.equalsIgnoreCase("Who buys more items? (more pieces)")) {
      double sum = 0.0;
      for (int value : shoppingList.values())
        sum += value;

      double sum2 = 0.0;
      for (int value2 : shoppingList2.values())
        sum2 += value2;

      {{
      if (sum2>sum);}
      System.out.println("Alice");}}
      else {
        System.out.println("Bob");



      }}





    }
// CR: formatting
















