import java.util.Random;
public class Sniper extends Adventurer {

  private int magicBullets, maxMagicBullets;

  // accessor methods
  public String getSpecialName() {

  }

  public int getSpecial() {

  }

  public void setSpecial(int n) {

  }

  public int getSpecialMax() {

  }

  // hurt ot hinder the target adventurer
  public String attack (Adventurer other) {

  }

  // heal or buff the target adventurer
  public String support (Adventurer other) {

  }

  // heal or buff self
  public String support() {

  }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other) {

  }

}
