//Create a Sharpie class
// should know the followings about each sharpie:
//
// color (which should be a string),
//  width (which will be a number) and the
//   inkAmount (another number)
//   We need to specify the color and the width at creation
//  Every sharpie is created with a default inkAmount value: 100
//  We can use() the sharpie objects: using it decreases inkAmount by 10

package sharpie;

public class Sharpie {
  String color;
  int width;
  int inkAmount = 100;

  public Sharpie(){

  }
  public Sharpie(String color, int width, int inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;


}public int use(){
    inkAmount--;
    return inkAmount;

  }
}
