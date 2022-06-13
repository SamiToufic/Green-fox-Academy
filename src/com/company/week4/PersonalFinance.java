import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalFinance {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(500);
    list.add(1000);
    list.add(1250);
    list.add(175);
    list.add(800);
    list.add(120);
    float sum = 0;
    for (int i: list) {
      sum += i;


    }



    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    if (name.equalsIgnoreCase("How much did we spend?"))
    {

      System.out.println(list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4) + list.get(5));
    }
      else if (name.equalsIgnoreCase("Which was our greatest expense?"))
    {
      System.out.println(list.get(2));
    }
    else if (name.equalsIgnoreCase("Which was our cheapest spending?")) {
      System.out.println(list.get(5));
    }
      else if (name.equalsIgnoreCase("What was the average amount of our spendings?"))
    {
      System.out.println((sum)/6);


  }}}
  // CR: formatting