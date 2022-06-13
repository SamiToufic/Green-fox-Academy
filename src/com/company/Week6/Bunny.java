public class Bunny {
  public static void main(String[] args) {

    System.out.println(bunny1(67));
  }
  public static int bunny1(int numBunny) {
    if(numBunny <= 0) {
      return 0;
    }else
    return (2 + bunny1(numBunny - 1));
  }
}
