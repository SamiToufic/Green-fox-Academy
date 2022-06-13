public class String1 {
  public static void main(String[] args) {
    System.out.println(string1("xxxaa"));
  }
  public static String string1(String inputString) {
    if (inputString.length() <= 0) {
      return "";
    }
    String firstChar = inputString.startsWith("x") ? "y" : inputString.substring(0, 1);
    return firstChar + string1(inputString.substring(1));
    // CR: be careful about naming, on the exam you could get minus points for something like this
  }
}