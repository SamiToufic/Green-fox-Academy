package GardenApplication;

public class Fetus {
  protected Species type;
  protected String color;
  protected int waterAmount;
  protected int waterAbsorbing;
  protected int minWaterAmount;

  public Fetus() {
  }

  public Fetus(String color) {
    this.color = color;
  }

  public boolean needWater() {
    if (this.minWaterAmount > this.waterAmount) {
      return true;
    } else {
      return false;
    }
  }

  public void drink(double water) {
    waterAmount += water * waterAbsorbing /100;
  }

  public void getSatus() {
    System.out.println("The " + this.color + " " + this.type + (this.needWater() ? " does" : " doesnt") + " need water.");
  }
}
