public class StringAgainAgain {
  public static void main(String[]args){
    System.out.println(string3("Feri!!"));
  }
  public static String string3(String input) {
    if (input.length() == 0) {
      return "";
    }
    String firstChar = input.substring(0, 1) + "*";
    return firstChar + string3(input.substring(1));
    // CR: same as before
  }
}