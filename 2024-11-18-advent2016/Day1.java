import java.util.*;
import java.io.*;

public class Day1 {

  public static String traverseGrid(String[] data) {

    //facing: 0 for north, 1 for east, 2 for south, 3 for west
    int x = 0, y = 0, facing = 0;

    //declaring ArrayList to store points
    ArrayList<int[]> points = new ArrayList<int[]>();
    points.add(new int[] {0, 0});

    for (int i = 0; i < data.length; i++) {

      //declaring direction and magnitude
      String direction = data[i].substring(0, 1);
      int magnitude = Integer.parseInt(data[i].substring(1));

      //for right turns
      if (direction.equals("R")) {
        if (facing == 0) {
          facing = 1;
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(new int[] {x, y});
          }
        } else if (facing == 1) {
          facing = 2;
          for (int j = 0; j < magnitude; j++) {
            y--;
            points.add(new int[] {x, y});
          }
        } else if (facing == 2) {
          facing = 3;
          for (int j = 0; j < magnitude; j++) {
            x--;
            points.add(new int[] {x, y});
          }
        } else if (facing == 3) {
          facing = 0;
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(new int[] {x, y});
          }
        }
      }

      //for left turns
      if (direction.equals("L")) {
        if (facing == 0) {
          facing = 3;
          for (int j = 0; j < magnitude; j++) {
            x--;
            points.add(new int[] {x, y});
          }
        } else if (facing == 1) {
          facing = 0;
          for (int j = 0; j < magnitude; j++) {
            y++;
            points.add(new int[] {x, y});
          }
        } else if (facing == 2) {
          facing = 1;
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(new int[] {x, y});
          }
        } else if (facing == 3) {
          facing = 2;
          for (int j = 0; j < magnitude; j++) {
            y--;
            points.add(new int[] {x, y});
          }
        }
      }

    }

    //distance for part 1
    int distance = x + y;

    //for part 2
    for (int i = 0; i < points.size(); i++) {

      int[] tempArr = points.get(i);

      //looping through the same ArrayList again
      for (int j = i+1; j < points.size(); j++) {

        int[] tempArr2 = points.get(j);

        if (Arrays.equals(tempArr, tempArr2)) {
          return distance + ", " + Arrays.toString(tempArr);
        }

      }

    }

    return distance + ", could not find";

  }

}
