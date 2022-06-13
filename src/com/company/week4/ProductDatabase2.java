import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductDatabase2 {
  public static void main(String[] args) {
    Map<String, Integer> productsPrice = new HashMap<String, Integer>();



    productsPrice.put("Eggs", 200);
    productsPrice.put("Milk", 200);
    productsPrice.put("Fish", 400);
    productsPrice.put("Apples", 150);
    productsPrice.put("Bread", 50);
    productsPrice.put("Chicken", 550);


    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    // CR: same as in exercise before
    if (name.equalsIgnoreCase("Which products cost less than 201? (just the name)")){

      for (Map.Entry<String, Integer> entry : productsPrice.entrySet()) {
        if (entry.getValue() < 201) {


          System.out.println(entry.getKey());
        }}}

        if (name.equalsIgnoreCase("Which products cost more than 150? (name + price)")){

          for (Map.Entry<String, Integer> entry2 : productsPrice.entrySet()) {
            if (entry2.getValue() > 150){

              System.out.println(entry2.getKey() +" "+ entry2.getValue());
      }}}}} // CR: formatting
