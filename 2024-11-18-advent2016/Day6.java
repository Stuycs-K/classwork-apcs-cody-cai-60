import java.util.*;
import java.io.*;

public class Day6 {

  public static String repetitionCode (String filename) {

    try {

      Scanner input = new Scanner (new File(filename));
      ArrayList<String[]> tempData = new ArrayList<String[]> ();
      String maxResult = "";
      String leastResult = "";

      // parsing input data
      while (input.hasNextLine()) {
        String[] lineData = input.nextLine().split("");
        tempData.add(lineData);
      }

      //constructing data set for further use
      ArrayList<String[]> data = new ArrayList<String[]> ();

      for (int i = 0; i < tempData.get(0).length; i++) {
        String[] newRow = new String[tempData.size()];

        for (int j = 0; j < tempData.size(); j++) {
          newRow[j] = tempData.get(j)[i];
        }

        data.add(newRow);
      }

      // initializing letters
      String[] letters = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

      for (int i = 0; i < data.size(); i++) {

        ArrayList<int[]> count = new ArrayList<int[]> ();

        //adding int arrays, index 0 is letter number, index 1 is count
        for (int j = 0; j < letters.length; j++) {
            count.add(new int[] {j, 0});
        }

        // counting letters in this row
        for (int j = 0; j < data.get(i).length; j++) {
          for (int k = 0; k < letters.length; k++) {
            if (data.get(i)[j].equals(letters[k])) {
              count.get(k)[1]++;
            }
          }
        }

        // finding max count
        int maxCount = 0;
        int letterOfMaxCount = 0;

        for (int j = 0; j < count.size(); j++) {
          if (count.get(j)[1] > maxCount) {
            maxCount = count.get(j)[1];
            letterOfMaxCount = count.get(j)[0];
          }
        }

        maxResult += letters[letterOfMaxCount];

        // finding least count
        int leastCount = data.get(0).length;
        int letterOfLeastCount = 0;

        for (int j = 0; j < count.size(); j++) {
          if (count.get(j)[1] == 0) {
            count.remove(j);
            j--;
          }
        }

        for (int j = 0; j < count.size(); j++) {
          if (count.get(j)[1] < leastCount) {
            leastCount = count.get(j)[1];
            letterOfLeastCount = count.get(j)[0];
          }
        }

        leastResult += letters[letterOfLeastCount];

      }

      return maxResult + ", " + leastResult;

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    }

  }

}
