 package counter;
public class Counter {
  int counter= 0;

  public Counter(){

  }
   public Counter(int counter) {
     this.counter = counter;


}
   public int add() {
     this.counter++;
     return this.counter;
   }

   public int add(int number) {
     this.counter += number;
     return this.counter;
   }


   public int get(int i) {
     return this.counter;
   }
   public int reset(){
    return this.counter;
   }
}
