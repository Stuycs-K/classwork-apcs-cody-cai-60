import java.util.Random;
public abstract class Sniper extends Adventurer {

  private int magicBullets, maxMagicBullets;

  // constructors
  public Sniper(String name){
    super(name);
  }

  public Sniper(String name, int hp) {
    super(name, hp);
  }

  // accessor methods
  public String getSpecialName() {
    return "Magic Bullets";
  }

  public int getSpecial() {
    return this.magicBullets;
  }

  public void setSpecial(int n) {
    this.magicBullets = n;
  }

  public int getSpecialMax() {
    return this.maxMagicBullets;
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
  public String specialAttack(Adventurer other) {

  }

}
