public class StringAgain {
  public static void main(String[] args) {
    System.out.println(string2("xaxaxaxax"));
  }
  public static String string2(String input) {
    if(input.length() == 0) {
      return "";
    }
    String firstChar = input.startsWith("x") ? "" : input.substring(0, 1);
    return firstChar + string2(input.substring(1));
    // CR: same as before
  }
}