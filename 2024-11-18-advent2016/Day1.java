import java.util.*;
import java.io.*;

public class Day1 {

  public static int traverseGrid(String[] data) {

    //facing: 0 for north, 1 for east, 2 for south, 3 for west
    int x = 0, y = 0, facing = 0;

    for (int i = 0; i < data.length; i++) {

      //declaring direction and magnitude
      String direction = data[i].substring(0, 1);
      int magnitude = Integer.parseInt(data[i].substring(1));

      //declaring ArrayList to store points
      ArrayList<Integer> points = new ArrayList<Integer>();

      //for right turns
      if (direction.equals("R")) {
        if (facing == 0) {
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(x);
            points.add(y);
          }
          facing = 1;
        } else if (facing == 1) {
          for (int j = 0; j < magnitude; j++) {
            y--;
            points.add(x);
            points.add(y);
          }
          facing = 2;
        } else if (facing == 2) {
          for (int j = 0; j < magnitude; j++) {
            x--;
            points.add(x);
            points.add(y);
          }
          facing = 3;
        } else if (facing == 3) {
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(x);
            points.add(y);
          }
          facing = 0;
        }
      }

      //for left turns
      if (direction.equals("L")) {
        if (facing == 0) {
          for (int j = 0; j < magnitude; j++) {
            x--;
            points.add(x);
            points.add(y);
          }
          facing = 3;
        } else if (facing == 1) {
          for (int j = 0; j < magnitude; j++) {
            y++;
            points.add(x);
            points.add(y);
          }
          facing = 0;
        } else if (facing == 2) {
          for (int j = 0; j < magnitude; j++) {
            x++;
            points.add(x);
            points.add(y);
          }
          facing = 1;
        } else if (facing == 3) {
          for (int j = 0; j < magnitude; j++) {
            y--;
            points.add(x);
            points.add(y);
          }
          facing = 2;
        }
      }

    }

    //distance for part 1
    int distance = x + y;

    //for part 2
    for (int i = 0; i < points.size(); i++) {
      
    }

  }

}
