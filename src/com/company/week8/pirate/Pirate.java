
package pirate;

import java.util.Random;

public class Pirate {
  private boolean isDrunk;
  private int levelOfIntoxication;
  private boolean isAlive;
  private boolean isCaptain;

  public Pirate() {
    this.levelOfIntoxication = 0;
    this.isDrunk = false;
    this.isAlive = true;
    this.isCaptain = false;


  }
  public void drinkSomeRum(int drunkenLevel){

      if (this.isAlive) {
        levelOfIntoxication++;
      } else {
        System.out.println("He is dead");

    }}
    public void howsItGoingMate() {
      if (levelOfIntoxication <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.isDrunk = true;
      }}

    public void die() {
      this.isAlive = false;
    }

    public void brawl(Pirate secondPirate) {
      int chance = new Random().nextInt(3);
      if (secondPirate.isAlive) {
        if (chance == 0) {
          this.die();
        } else if (chance == 1) {
          secondPirate.die();
        } else {
          this.die();
          secondPirate.die();
        }
      }

  }
  public boolean isAlive() {
    return isAlive;
  }

  public int getIntoxicationLevel() {
    return levelOfIntoxication;
  }

  public void setIntoxicationLevel(int intoxicationLevel) {
    this.levelOfIntoxication = intoxicationLevel;
  }

  public void setCaptain() {
    isCaptain = true;
  }
}





