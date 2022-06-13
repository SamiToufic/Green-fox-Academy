import java.util.Scanner;

public class DevideByZero {
  public static void main(String[] args) {
  int n = 10;
  Scanner number= new Scanner(System.in);
  int devider = number.nextInt();

  try {
    int result = n/devider;
     System.out.println(result);
  }
  catch (ArithmeticException e){
    System.out.println("fail");
  }
}}



