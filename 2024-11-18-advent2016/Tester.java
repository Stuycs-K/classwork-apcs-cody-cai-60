import java.io.*;
import java.util.*;

public class Tester {

  public static String[] parseDay1(String filename) {

    try {
      Scanner input = new Scanner(new File(filename));
      String[] result = input.nextLine().split(", ");
      return result;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }

  }

  public static void main(String[] args) {

    String task = "";
    String filename = "";

    //Testing day 3 parts 1 and 2
    task = "Day 3 Parts 1 & 2";
    filename = "Day3Input.txt";
    System.out.println(task + ": " + Day3.countTriangles1(filename) + ", " + Day3.countTriangles2(filename));

    //Testing day 1 part 1
    task = "Day 1 Part 1";
    filename = "Day1Input.txt";
    String[] data = parseDay1(filename);
    System.out.println(task + ": " + Day1.traverseGrid(data));

    //Testing day 2 part 1
    task = "Day 2 Part 1";
    filename = "Day2Input.txt";
    System.out.println(task + ": " + Day2.keypad(filename));

    //Testing day 4 part 1
    task = "Day 4 Part 1";
    filename = "Day4Input.txt";
    System.out.println(task + ": " + Day4.sectorIDs(filename));

    //Testing day 6 part 1
    task = "Day 6 Part 1";
    filename = "Day6Input.txt";

  }

}
