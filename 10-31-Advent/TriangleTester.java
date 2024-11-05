import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  //Part A
  public static boolean checkTriangle(int a, int b, int c) {
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
      return true;
    } else {
      return false;
    }
  }

  public static int countTrianglesA(String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      while (input.hasNextLine() && input.hasNextInt()) {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (checkTriangle(a, b , c)) {
          count++;
        }
      }
      input.close();
      return count;
    } catch (FileNotFoundException e) {
      return -1;
    }
  }

  //Part B

  public static int countTrianglesB (String filename) {
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int count = 0;
      String tri1 = "";
      String tri2 = "";
      String tri3 = "";
      while (input.hasNextInt() && input.hasNextLine()) {
        for (int i = 0; i < 3; i++) {
          tri1 += input.nextInt() + " ";
          tri2 += input.nextInt() + " ";
          tri3 += input.nextInt() + " ";
        }
        String[] tri1Arr = tri1.split(" ");
        String[] tri2Arr = tri2.split(" ");
        String[] tri3Arr = tri3.split(" ");
        if (checkTriangle(Integer.parseInt(tri1Arr[0]), Integer.parseInt(tri1Arr[1]), Integer.parseInt(tri1Arr[2]))) {
          count++;
        }
        if (checkTriangle(Integer.parseInt(tri2Arr[0]), Integer.parseInt(tri2Arr[1]), Integer.parseInt(tri2Arr[2]))) {
          count++;
        }
        if (checkTriangle(Integer.parseInt(tri3Arr[0]), Integer.parseInt(tri3Arr[1]), Integer.parseInt(tri3Arr[2]))) {
          count++;
        }
        tri1 = "";
        tri2 = "";
        tri3 = "";
      }
      return count;

    } catch (FileNotFoundException e) {
      return -1;
    }
  }

  public static void main(String[] args) {
    //Testing part a
    System.out.println(countTrianglesA("inputTri.txt")); //correct answer 52

    //Testing part break;
    System.out.println(countTrianglesB("inputTri.txt")); //correct answer 95
  }

}
