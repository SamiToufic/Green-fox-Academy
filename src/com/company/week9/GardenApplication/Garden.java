package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {


  List<Fetus> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void watering(int water ){
    System.out.println("Waterig with " + water);
    double eachGetWater = water / plants.size();
    for (Fetus item: plants){
      if(item.needWater()){
        item.drink(eachGetWater);
      }
    }
  }
}
