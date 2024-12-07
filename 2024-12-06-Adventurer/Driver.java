public class Driver {

  public static void main (String[] args) {

    Adventurer p1 = new Sniper("Cody", 10);
    Adventurer p2 = new Sniper("Amy", 10, 10);

    // testing attacks
    System.out.println(p1.attack(p2));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    System.out.println(p2.attack(p1));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    System.out.println(p1.attack(p2));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    System.out.println(p2.attack(p1));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    System.out.println(p1.attack(p2));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    // testing heals
    System.out.println(p1.support());
    System.out.println(p2.support());
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    System.out.println(p1.support(p2));
    System.out.println(p2.support(p1));
    System.out.println(p1.getHP());
    System.out.println(p2.getHP());

    // testing special attacks
    System.out.println(p1.getSpecial());
    System.out.println(p2.getSpecial());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.getSpecial());
    System.out.println(p2.getSpecial());

    p1.setSpecial(0);
    System.out.println(p1.getSpecial());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p1.getSpecial());

  }

}
