package GardenApplication;

public class Tree extends Fetus  {

  public Tree(String color) {
    super(color);
    this.waterAbsorbing = 40;
    this.minWaterAmount = 10;
    this.type = Species.Tree;
  }
}
