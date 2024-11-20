import java.io.*;
import java.util.*;

public class Day2 {

  public static String keypad(String filename) {

    //creating keypad as 2d array
    String[][] keypad = {
      {"1", "2", "3"},
      {"4", "5", "6"},
      {"7", "8", "9"}
    };

    //starting position
    int row = 1, column = 1;

    String result = "";

    try {

      File file = new File(filename);
      Scanner input = new Scanner(file);

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] data = line.split("");

        for (int i = 0; i < data.length; i++) {
          if (data[i].equals("U") && row > 0) {
            row--;
          } else if (data[i].equals("D") && row < 2) {
            row++;
          } else if (data[i].equals("L") && column > 0) {
            column--;
          } else if (data[i].equals("R") && column < 2) {
            column++;
          }
        }

        result += keypad[row][column];

      }

      input.close();
      return result;

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }

  }

}
