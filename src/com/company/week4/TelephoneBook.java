import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneBook {
  public static void main(String[] args) {
    Map<String, String> mapa = new HashMap<String, String>();
    mapa.put("William A. Lathan", "405-709-1865");
    mapa.put("John K. Miller", "402-247-8568");
    mapa.put("Hortensia E. Foster", "606-481-6467");
    mapa.put("Amanda D. Newland", "319-243-5613");
    mapa.put("Brooke P. Askew", "307-687-2982");








    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    // CR: same as before
    if (name.equalsIgnoreCase("What is John K. Miller's phone number?"))
    {

      System.out.println(mapa.get("John K. Miller"));
    }
    // CR: same as before
    else if (name.equalsIgnoreCase("Whose phone number is 307-687-2982?")) {
      for(Map.Entry<String, String> entry: mapa.entrySet()) {
        if(entry.getValue() == "307-687-2982") {
          System.out.println(entry.getKey());


    }}}
    // CR: same as before and formatting
    else if (name.equalsIgnoreCase("Do we know Chris E. Myers phone number?")) {
      if (mapa.get("Chris E. Myers") == null){

          System.out.println("NO");
        }}

      else{
        System.out.println("");
          }


    }
  }

