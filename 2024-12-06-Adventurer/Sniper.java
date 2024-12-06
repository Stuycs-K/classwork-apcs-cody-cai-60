import java.util.Random;
public abstract class Sniper extends Adventurer {

  private int magicBullets, maxMagicBullets;

  // constructors
  public Sniper(String name){
    super(name);
    this.magicBullets = 5;
    this.maxMagicBullets = 5;
  }

  public Sniper(String name, int hp) {
    super(name, hp);
    this.maxMagicBullets = 5;
    this.magicBullets = maxMagicBullets;
  }

  public Sniper(String name, int hp, int magicBullets) {
    super(name, hp);
    this.magicBullets = magicBullets;
    this.maxMagicBullets = magicBullets;
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
    Random rand = new Random();
    int dmg = rand.nextInt(10);
    if (dmg > other.getHP()) {
      dmg = other.getHP();
    }
    other.setHP(other.getHP() - dmg);
    return "Target Hit!";
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
