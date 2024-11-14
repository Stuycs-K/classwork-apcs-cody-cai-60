//Explanation for Part 8:
// When getName(); was overwritten, the speak method in the Bird class now calls the new getName();
// This is because although bird is an Animal, it has access to the Bird methods
//Explanation for Part 10:
// Bird is-a Animal, but Animal is not a Bird
// A Bird has all the methods of Animal, but an Animal does not have all the methods of Bird

public class Driver{

  public static void main(String[] args){
    Animal cat = new Animal("meow", 3, "Kitty");
    cat.speak();

    Animal bird = new Bird("squawk", 5, "Bird", 3.0, "blue");
    bird.speak();

    //testing step 9
    Animal a1 = new Animal("Bobby", 12, "boop");
    a1.speak();
    Bird b1 = new Bird("Billy", 14, "beep", 5.7, "red");
    b1.speak();
    //Bird b2 = new Animal("Belly", 13, "blop");    ERROR
    Animal a2 = new Bird("Bully", 15, "blip", 2, "yellow");
    a2.speak();
  }

}
