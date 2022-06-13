
  public class Reverse {
    public static void main(String... args){
      String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

      // Create a method that can reverse a string which is passed as parameter
      // Pass the `toBeReversed` variable to this method to check if it works well
      // At first, solve this task using the `charAt()` function
      // Try other solutions when you are done
      String s = "";
      StringBuffer sbf = new StringBuffer(toBeReversed);
      System.out.println(sbf.reverse());
      System.out.println(toBeReversed);
      for (int i = toBeReversed.length()-1; i >=0 ; i--) {
        s = s + toBeReversed.charAt(i);
        System.out.println(s);


      }

    }
  }



