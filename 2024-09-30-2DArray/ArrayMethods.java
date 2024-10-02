//1. Write both your names + emails at the top of the document as a comment.
//Jason Chan, jchan61@stuy.edu; Cody Cai, ccai60@stuy.edu

public class ArrayMethods {

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
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

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        result[j][i] = nums[i][j];
      }
    }
    return result;
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

  public static void main (String[] args) {

    //testing arrToString(int[][]ary)
    int[][] ary = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | Return: " + arrToString(ary) +  " | Match? " + arrToString(ary).equals("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]"));
    ary = new int[][] {{1, 2}, {4, 5}, {7, 8}};
    System.out.println("Expected: [[1, 2], [4, 5], [7, 8]] | Return: " + arrToString(ary) +  " | Match? " + arrToString(ary).equals("[[1, 2], [4, 5], [7, 8]]"));
    ary = new int[][] {{}, {}, {}};
    System.out.println("Expected: [[], [], []] | Return: " + arrToString(ary) +  " | Match? " + arrToString(ary).equals("[[], [], []]"));
    ary = new int[][] {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
    System.out.println("Expected: [[1, 2, 3, 4], [5, 6], [7, 8, 9, 10, 11]] | Return: " + arrToString(ary) +  " | Match? " + arrToString(ary).equals("[[1, 2, 3, 4], [5, 6], [7, 8, 9, 10, 11]]"));
    ary = new int[][] {{1, 2, 3}, {}, {7, 8, 9, 10}};
    System.out.println("Expected: [[1, 2, 3], [], [7, 8, 9, 10]] | Return: " + arrToString(ary) +  " | Match? " + arrToString(ary).equals("[[1, 2, 3], [], [7, 8, 9, 10]]"));

    //testing arr2DSum
    int[][] ary2 = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}};
    System.out.println("Expected: 78 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 78));
    ary2 = new int[][] {{1, 2, 3}, {5, 6}, {9, 10, 11, 12}};
    System.out.println("Expected: 59 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 59));
    ary2 = new int[][] {{1}, {5, 8}, {}};
    System.out.println("Expected: 14 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 14));
    ary2 = new int[][] {{}, {}, {0}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 0));
    ary2 = new int[][] {{0, 0, 0, 0}, {0, 0}, {0, 0, 0}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 0));
    ary2 = new int[][] {{}, {}, {}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary2) + " | Match? " + (arr2DSum(ary2) == 0));

    //testing swapRC
    int[][] ary3 = {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[1, 4], [2, 5], [3, 6]]"));
    ary3 = new int[][] {{4, 7, 15}, {13, 28, 6}, {14, 28, 37}};
    System.out.println("Expected: [[4, 13, 14], [7, 28, 28], [15, 6, 37]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[4, 13, 14], [7, 28, 28], [15, 6, 37]]"));
    ary3 = new int[][] {{1, 2}, {4, 5}, {7, 8}};
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[1, 4, 7], [2, 5, 8]]"));
    ary3 = new int[][] {{1}, {4}, {7}};
    System.out.println("Expected: [[1, 4, 7]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[1, 4, 7]]"));
    ary3 = new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    System.out.println("Expected: [[0, 0, 0], [0, 0, 0], [0, 0, 0]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[0, 0, 0], [0, 0, 0], [0, 0, 0]]"));
    ary3 = new int[][] {{0}, {0}, {0}};
    System.out.println("Expected: [[0, 0, 0]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[0, 0, 0]]"));
    ary3 = new int[][] {{1, 5, 6, 7}, {2, 15, 29, 21}};
    System.out.println("Expected: [[1, 2], [5, 15], [6, 29], [7, 21]] | Return: " + arrToString(swapRC(ary3)) + " | Match? " + arrToString(swapRC(ary3)).equals("[[1, 2], [5, 15], [6, 29], [7, 21]]"));

    //testing replaceNegative
    int[][] ary4 = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 0, 0], [0, 1, 0], [0, 0, 1]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 0, 0], [0, 1, 0], [0, 0, 1]]"));
    ary4 = new int[][] {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 0, 0], [0, 5, 0], [0, 0, 9]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 0, 0], [0, 5, 0], [0, 0, 9]]"));
    ary4 = new int[][] {{1, 2}, {4, 5, 6, 7}, {8}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 2], [4, 5, 6, 7], [8]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 2], [4, 5, 6, 7], [8]]"));
    ary4 = new int[][] {{-1, -2}, {4, -5, 6, -7}, {-8}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 0], [4, 1, 6, 0], [0]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 0], [4, 1, 6, 0], [0]]"));
    ary4 = new int[][] {{0, 0, 0}, {0}, {0, 0, 0, 0, 0}};
    replaceNegative(ary4);
    System.out.println("Expected: [[0, 0, 0], [0], [0, 0, 0, 0, 0]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[0, 0, 0], [0], [0, 0, 0, 0, 0]]"));
    ary4 = new int[][] {{1, 2}, {4, 5, 6, 7}, {8}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 2], [4, 5, 6, 7], [8]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 2], [4, 5, 6, 7], [8]]"));
    ary4 = new int[][] {{-1}, {1, -2}, {1, 2, -3}, {1, 2, 3, -4}, {1, 2, 3, 4, -5}, {1, 2, 3, 4, 5, -6}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1], [1, 1], [1, 2, 1], [1, 2, 3, 1], [1, 2, 3, 4, 1], [1, 2, 3, 4, 5, 1]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1], [1, 1], [1, 2, 1], [1, 2, 3, 1], [1, 2, 3, 4, 1], [1, 2, 3, 4, 5, 1]]"));
    ary4 = new int[][] {{-1, 2, 3, 4, 5, 6}, {1, -2, 3, 4, 5}, {1, 2, -3, 4}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 2, 3, 4, 5, 6], [1, 1, 3, 4, 5], [1, 2, 1, 4]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 2, 3, 4, 5, 6], [1, 1, 3, 4, 5], [1, 2, 1, 4]]"));
    ary4 = new int[][] {{-1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1}};
    replaceNegative(ary4);
    System.out.println("Expected: [[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0]] | Return: " + arrToString(ary4) + " | Match? " + arrToString(ary4).equals("[[1, 0, 0, 0, 0], [0, 1, 0, 0, 0], [0, 0, 1, 0, 0]]"));

    //testing copy
    int[][] ary5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{2, 3}, {21, 4, 513, 5}, {1, 2, 3, 21, 41}};
    System.out.println("Expected: [[2, 3], [21, 4, 513, 5], [1, 2, 3, 21, 41]] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[2, 3], [21, 4, 513, 5], [1, 2, 3, 21, 41]]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    System.out.println("Expected: [[0, 0, 0], [0, 0, 0], [0, 0, 0]] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[0, 0, 0], [0, 0, 0], [0, 0, 0]]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{2, 7}, {0, 4, 0, 5}, {1, 2, 0, 21, 0}, {21, 62, 0, 1, 0, 0}};
    System.out.println("Expected: [[2, 7], [0, 4, 0, 5], [1, 2, 0, 21, 0], [21, 62, 0, 1, 0, 0]] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[2, 7], [0, 4, 0, 5], [1, 2, 0, 21, 0], [21, 62, 0, 1, 0, 0]]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{0, 0, 0, 0}, {0, 0}, {0}, {0, 0, 0}};
    System.out.println("Expected: [[0, 0, 0, 0], [0, 0], [0], [0, 0, 0]] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[0, 0, 0, 0], [0, 0], [0], [0, 0, 0]]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{}, {}, {}};
    System.out.println("Expected: [[], [], []] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[], [], []]") + " | Different Address? " + !(ary5 == copy(ary5)));
    ary5 = new int[][] {{}, {0, 0}, {0}, {0, 0, 0}, {}};
    System.out.println("Expected: [[], [0, 0], [0], [0, 0, 0], []] | Return: " + arrToString(copy(ary5)) + " | Same Elements? " + arrToString(copy(ary5)).equals("[[], [0, 0], [0], [0, 0, 0], []]") + " | Different Address? " + !(ary5 == copy(ary5)));

  }

}
