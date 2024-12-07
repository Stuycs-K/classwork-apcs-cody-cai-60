import java.util.Random;
public class Sniper extends Adventurer {

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
    int dmg = rand.nextInt(5);
    if (dmg > other.getHP()) {
      dmg = other.getHP();
    }
    other.setHP(other.getHP() - dmg);
    return "Target Hit! Damage Dealt: " + dmg + " Target's HP: " + other.getHP();
  }

  // heal or buff the target adventurer
  public String support (Adventurer other) {
    Random rand = new Random();
    int heal = rand.nextInt(5);
    if (heal > other.getmaxHP() - other.getHP()) {
      heal = other.getmaxHP() - other.getHP();
    }
    other.setHP(other.getHP() + heal);
    return "Target Healed! Healed By: " + heal + " Target's HP: " + other.getHP();
  }

  // heal or buff self
  public String support() {
    Random rand = new Random();
    int heal = rand.nextInt(5);
    if (heal > getmaxHP() - getHP()) {
      heal = getmaxHP() - getHP();
    }
    setHP(getHP() + heal);
    return "Healed! Healed By: " + heal + " HP: " + getHP();
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    Random rand = new Random();
    int dmg = rand.nextInt(other.getHP());
    if (getSpecial() > 0) {
      if (dmg > other.getmaxHP() - other.getHP()) {
        dmg = other.getmaxHP() - other.getHP();
      }
      other.setHP(other.getHP() - dmg);
      setSpecial(getSpecial() - 1);
      return "Target Hit! Damage Dealt: " + dmg + " Target's HP: " + other.getHP();
    } else {
      return "Attack Failed! Out of Magic Bullets";
    }
  }

}
