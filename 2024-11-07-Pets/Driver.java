// When getName(); was overwritten, the speak method in the Bird class now calls the new getName();
// Instead of returning NAME, it returns The Mighty NAME
//This is because although bird is an Animal, it has access to the Bird methods

public class Driver{

  public static void main(String[] args){
    Animal cat = new Animal("meow", 3, "Kitty");
    cat.speak();

    Animal bird = new Bird("squawk", 5, "Bird", 3.0, "blue");
    bird.speak();

    //testing step 9
    Animal a1 = new Animal("Bobby", 12, "boop");
    Bird b1 = new Bird("Billy", 14, "beep", 5.7, "red");
    //Bird b2 = new Animal("Belly", 13, "blop", 2.3, "purple");  ERROR
    //Animal a2 = new Bird("Bully", 15, "blip");   ERROR
  }

}
