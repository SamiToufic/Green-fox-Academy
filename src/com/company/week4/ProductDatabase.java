import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductDatabase {
  public static void main(String[] args) {
    Map<String, Integer> productsPrice = new HashMap<String, Integer>();
    Map.Entry<String, Integer> maxPrice = null;


    productsPrice.put("Eggs", 200);
    productsPrice.put("Milk", 200);
    productsPrice.put("Fish", 400);
    productsPrice.put("Apples", 150);
    productsPrice.put("Bread", 50);
    productsPrice.put("Chicken", 550);


    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    // CR: why get user input here and compare it?
    if (name.equalsIgnoreCase("How much is the fish?"))
      System.out.println(productsPrice.get("Fish"));

    // CR: same here
    if (name.equalsIgnoreCase("What is the most expensive product?")) {

      for (Map.Entry<String, Integer> entry : productsPrice.entrySet()) {
        if (maxPrice == null || entry.getValue().compareTo(maxPrice.getValue()) > 0) {
          maxPrice = entry;
        }
      }
      System.out.println(maxPrice.getValue());
    }

    float sum = productsPrice.values().stream().mapToInt(Integer::intValue).sum();

    // CR: and here
    if (name.equalsIgnoreCase("What is the average price?"))
      System.out.println(sum / productsPrice.size());

    // CR: and here
    if (name.equalsIgnoreCase("How many products' price is below 300?")) {
      int index = 0;
      for (Map.Entry<String, Integer> entry : productsPrice.entrySet()) {
        if (entry.getValue() < 300) {
          ++index;
        }
      }
      System.out.println(index);

    }

    // CR: and here
    if (name.equalsIgnoreCase("Is there anything we can buy for exactly 125?")) {
      for (Map.Entry<String, Integer> entry : productsPrice.entrySet()) {
        {

          if (entry.getValue() == 125) {


            System.out.println("yes");
          }else if (entry.getValue() != 125) {
            System.out.println("No");
          }

        }}} // CR: formatting
            if (name.equalsIgnoreCase("What is the cheapest product?")) {
              Map.Entry<String, Integer> min = null;
              for (Map.Entry<String, Integer> entry2 : productsPrice.entrySet()) {
                if (min == null || min.getValue() > entry2.getValue()) {
                  min = entry2;}}

            System.out.println(min.getKey());

          }
        }} // CR: formatting

// CR: I think you did not understand what you were supposed to do in this exercise
// CR: there was no need for user input you just had to practise HashMap operations


















