
package animal;

public class Animal {
  int hunger = 50;

  int thirst = 50;


  public Animal() {

  }

public Animal(int x, int y){
  this.hunger= hunger;
  this.thirst= thirst;

  }
  public void eat(){
    this.hunger--;

  }
  public void drink() {
    this.thirst--;
}
  public void play() {
    this.hunger++;
    this.thirst++;
  }}











