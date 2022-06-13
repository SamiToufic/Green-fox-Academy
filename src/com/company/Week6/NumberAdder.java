

public class NumberAdder {
  public static void main(String[] args) {

    System.out.println(numberAdder(6));

  }
  public static int numberAdder(int n) {

    if (n == 0)
      return 0;
    else

   return n +numberAdder(n-1);
  }}
