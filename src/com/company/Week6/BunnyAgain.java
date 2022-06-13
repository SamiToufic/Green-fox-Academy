public class BunnyAgain {
  public static void main(String[] args) {

    System.out.println(bunny2(6));
  }
  public static int bunny2(int numBunnies) {
    if(numBunnies <= 0) {
      return 0;
    }else
    return (numBunnies % 2 == 1) ? 2 + bunny2(numBunnies - 1) : 3 + bunny2(numBunnies - 1);
  }
}