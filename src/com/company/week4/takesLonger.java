public class takesLonger {
    public static void main(String... args) {
      String quote = "Hofstadter's Law: it you expect, even when you take into account Hofstadter's Law.";

      // When saving this quote a disk error has occurred. Please fix it!
      // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
      // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!
StringBuilder s = new StringBuilder(quote);
s.insert(20," always takes longer than");


      System.out.println(s);
      String v = quote.substring(0);
      System.out.println(v);
    }
  }

