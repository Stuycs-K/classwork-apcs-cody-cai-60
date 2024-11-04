import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static boolean checkTriangle(int a, int b, int c) {
    if ((a + b > c) || (a + c > b) || (b + c > a)) {
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

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }

}
