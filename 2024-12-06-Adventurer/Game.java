import java.util.Scanner;

public class Game {

  public static void main (String[] args) {

    Adventurer p1 = new CodeWarrior("Cody", 20, "python");
    String p1Name = p1.getName();
    int p1HP = p1.getHP();
    int p1maxHP = p1.getmaxHP();
    int p1Special = p1.getSpecial();
    int p1SpecialMax = p1.getSpecialMax();
    int p1SpecialName = p1.getSpecialName();

    Adventurer p2 = new Sniper("Amy", 20, 10);
    String p2Name = p2.getName();
    int p2HP = p2.getHP();
    int p2MaxHP = p2.getmaxHP();
    int p2Special = p2.getSpecial();
    int p2SpecialMax = p2.getSpecialMax();
    int p2SpecialName = p2.getSpecialName();

    Scanner userInput = new Scanner (System.in);

    String input = "";

    while (p1HP > 0 || p2HP > 0) {
      System.out.println(p1Name + ", " + p1HP + "/" + p1MaxHP + " HP, " + p1Special + "/" + p1SpecialMax + " " + p1SpecialMax);
      System.out.println("Type: (a)attack / (sp)ecial / (su)pport / quit");
      input = userInput.nextLine();
      if (input.equals("a") || input.equals("attack")) {
        p1.attack(p2);
      } else if (input.equals("sp") || input.equals("special")) {
        p1.specialAttack(p2);
      } else if (input.equals("su") || input.equals("support")) {
        p1.support();
      } else if (input.equals("quit")) {
        break;
      } else {
        System.out.println("Invalid Input! Type again: ");
        continue;
      }

  }

}
