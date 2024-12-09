import java.util.Scanner;

public class Game {

  public static void main (String[] args) {

    Adventurer p1 = new CodeWarrior("Cody", 20, "python");

    Adventurer p2 = new Sniper("Amy", 20, 10);

    Scanner userInput = new Scanner (System.in);

    String input = "";

    while (p1.getHP() > 0 && p2.getHP() > 0) {
      System.out.println(p1.getName() + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println("Type: (a)attack / (sp)ecial / (su)pport / quit");
      input = userInput.nextLine();
      if (input.equals("a") || input.equals("attack")) {
        System.out.println(p1.attack(p2));
      } else if (input.equals("sp") || input.equals("special")) {
        System.out.println(p1.specialAttack(p2));
      } else if (input.equals("su") || input.equals("support")) {
        System.out.println(p1.support());
      } else if (input.equals("quit")) {
        break;
      } else {
        System.out.println("Invalid Input! Type again: ");
        continue;
      }

      System.out.println(p2.getName() + ", " + p2.getHP() + "/" + p2.getmaxHP() + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
      int rand = (int) (Math.random() * 3);
      if (rand == 0) {
        System.out.println(p2.attack(p1));
      } else if (rand == 1) {
        System.out.println(p2.specialAttack(p1));
      } else {
        System.out.println(p2.support());
      }

    }

  }

}
