package GardenApplication;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Fetus rosy = new Flower("blue");
    Fetus tulip = new Flower("yellow");
    Fetus lTree = new Tree("purple");
    Fetus fTree = new Tree("orange");

    garden.plants.add(rosy);
    garden.plants.add(tulip);
    garden.plants.add(lTree);
    garden.plants.add(fTree);

    print(garden);
    garden.watering(40);
    print(garden);
    garden.watering(70);
    print(garden);
  }

  public static void print(Garden garden) {
    for (Fetus plant : garden.plants) {
      plant.getSatus();
    }
    System.out.println();
  }
}
