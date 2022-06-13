package GardenApplication;

public class Flower extends Fetus  {
  public Flower(String color) {
    super(color);
    this.waterAbsorbing = 75;
    this.minWaterAmount = 5;
    this.type = Species.Flower;
  }
}
