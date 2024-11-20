import java.io.*;
import java.util.*;

public class Day4 {

  public static int sectorIDs (String filename) {

    try {

      Scanner input = new Scanner(new File(filename));

      while (input.hasNextLine()) {

        //extracting line info
        String line = input.nextLine();
        String[] letters = line.substring(0, line.lastIndexOf("-")).split("-");
        String sectorID = line.substring(line.lastIndexOf("-")+1, line.indexOf("["));
        String checksum = line.substring(line.indexOf("[")+1, line.length()-1);

        

      }

      return -1;

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return -1;
    }

  }

}
