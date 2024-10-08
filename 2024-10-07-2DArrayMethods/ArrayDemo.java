import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //testing countZeros2D
    int[][] ary = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: 0 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 0));
    ary = new int[][] {{1, 3, 5}, {7, 9}, {11, 13, 15, 17, 19}};
    System.out.println("Expected: 0 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 0));
    ary = new int[][] {{2, 0, 125}, {1, 0, 21, 0}};
    System.out.println("Expected: 3 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 3));
    ary = new int[][] {{0, 0}};
    System.out.println("Expected: 2 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 2));
    ary = new int[][] {{0, 14, 26, 0}, {1, 0, 0, 0, 165, 12}};
    System.out.println("Expected: 5 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 5));
    ary = new int[][] {{67, 0, 12, 0, 0}, {0, 21, 25, 61, 0, 0}, {12, 6, 0, 23, 0}, {98, 0, 62, 0}};
    System.out.println("Expected: 10 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 10));
    ary = new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    System.out.println("Expected: 9 | Return: " + countZeros2D(ary) + " | Match? " + (countZeros2D(ary) == 9));

    //testing htmlTable
    int[][] ary2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: <table><tr><td>1</td><td>2</td><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr><tr><td>7</td><td>8</td><td>9</td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td>1</td><td>2</td><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr><tr><td>7</td><td>8</td><td>9</td></tr></table>"));
    ary2 = new int[][] {{12, 13, 14}, {1, 8, 3}};
    System.out.println("Expected: <table><tr><td>12</td><td>13</td><td>14</td></tr><tr><td>1</td><td>8</td><td>3</td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td>12</td><td>13</td><td>14</td></tr><tr><td>1</td><td>8</td><td>3</td></tr></table>"));
    ary2 = new int[][] {{0, 0}, {1, 8, 3}, {0, 12, 0, 12}};
    System.out.println("Expected: <table><tr><td>0</td><td>0</td></tr><tr><td>1</td><td>8</td><td>3</td></tr><tr><td>0</td><td>12</td><td>0</td><td>12</td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td>0</td><td>0</td></tr><tr><td>1</td><td>8</td><td>3</td></tr><tr><td>0</td><td>12</td><td>0</td><td>12</td></tr></table>"));
    ary2 = new int[][] {{}, {}, {}};
    System.out.println("Expected: <table><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr></table>"));
    ary2 = new int[][] {{12, 0, 67, 21, 42}, {1, 8, 3, 7}, {82, 5, 0}, {2, 6}, {2}};
    System.out.println("Expected: <table><tr><td>12</td><td>0</td><td>67</td><td>21</td><td>42</td></tr><tr><td>1</td><td>8</td><td>3</td><td>7</td></tr><tr><td>82</td><td>5</td><td>0</td></tr><tr><td>2</td><td>6</td></tr><tr><td>2</td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td>12</td><td>0</td><td>67</td><td>21</td><td>42</td></tr><tr><td>1</td><td>8</td><td>3</td><td>7</td></tr><tr><td>82</td><td>5</td><td>0</td></tr><tr><td>2</td><td>6</td></tr><tr><td>2</td></tr></table>"));
    ary2 = new int[][] {{}, {1, 8, 3}, {6, 2, 0, 2}, {}};
    System.out.println("Expected: <table><tr><td></td></tr><tr><td>1</td><td>8</td><td>3</td></tr><tr><td>6</td><td>2</td><td>0</td><td>2</td></tr><tr><td></td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td></td></tr><tr><td>1</td><td>8</td><td>3</td></tr><tr><td>6</td><td>2</td><td>0</td><td>2</td></tr><tr><td></td></tr></table>"));
    ary2 = new int[][] {{65, 2, 74, 9}, {}, {6, 93, 53, 2}, {}};
    System.out.println("Expected: <table><tr><td>65</td><td>2</td><td>74</td><td>9</td></tr><tr><td></td></tr><tr><td>6</td><td>93</td><td>53</td><td>2</td></tr><tr><td></td></tr></table> | Return: " + htmlTable(ary2) + " | Match? " + htmlTable(ary2).equals("<table><tr><td>65</td><td>2</td><td>74</td><td>9</td></tr><tr><td></td></tr><tr><td>6</td><td>93</td><td>53</td><td>2</td></tr><tr><td></td></tr></table>"));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String answer = "[";
    for (int i = 0; i < ary.length; i++){
      answer += ary[i];
      if (i < ary.length-1) {
        answer += ", ";
      }
    }
    return answer + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary) {
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      result += arrToString(ary[i]);
      if (i < ary.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][]nums){
     int sum = 0;
     for (int i = 0; i < nums.length; i++) {
       for (int j = 0; j < nums[i].length; j++) {
         sum += nums[i][j];
       }
     }
     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0 && i == j) {
          vals[i][j] = 1;
        }
        if (vals[i][j] < 0) {
          vals[i][j] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.

  public static int[] returnCopy (int[] ary) {
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      result[i] = ary[i];
    }
    return result;
  }

  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      result[i] = returnCopy(nums[i]);
    }
    return result;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        result[j][i] = nums[i][j];
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++) {
      result += "<tr>";
      for (int j = 0; j < nums[i].length; j++) {
        result += "<td>" + nums[i][j] + "</td>";
      }
      if (nums[i].length == 0) {
        result += "<td></td>";
      }
      result += "</tr>";
    }
    return result + "</table>";
  }
}
