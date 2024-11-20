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

      //for right turns
      if (direction.equals("R")) {
        if (facing == 0) {
          x += magnitude;
          facing = 1;
        } else if (facing == 1) {
          y -= magnitude;
          facing = 2;
        } else if (facing == 2) {
          x -= magnitude;
          facing = 3;
        } else if (facing == 3) {
          y += magnitude;
          facing = 0;
        }
      }

      //for left turns
      if (direction.equals("L")) {
        if (facing == 0) {
          x -= magnitude;
          facing = 3;
        } else if (facing == 1) {
          y += magnitude;
          facing = 0;
        } else if (facing == 2) {
          x += magnitude;
          facing = 1;
        } else if (facing == 3) {
          y -= magnitude;
          facing = 2;
        }
      }

    }

    //calculating distance
    return x + y;
  }

}
