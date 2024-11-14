import java.util.ArrayList;

public class ArraylistPractice {

  public static ArrayList<String> createRandomArray (int size) {
    ArrayList result = new ArrayList<String>();
    for (int i = 0; i < size; i++) {
      String add = "";
      int rand = (int)(Math.random() * 11);
      if (rand == 0) {
        result.add(add);
      } else {
        add += "" + rand;
        result.add(rand);
      }
    }
    return result;
  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
    return original;
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
  }



}
