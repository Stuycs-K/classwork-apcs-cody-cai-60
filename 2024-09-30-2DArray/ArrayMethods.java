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
  public static String arrToString(int[][]ary){
    String answer = "[[";
    for (int i = 0; i < ary.length; i++) {
      for (int j = 0; j < ary[i].length; j++) {
        answer += ary[i][j];
        if (j < ary[i].length-1) {
          answer += ", ";
        }
      }
      if (i < ary.length-1) {
        answer += "], [";
      }
    }
    return answer + "]]";
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

  public static void main (String[] args) {

    //testing arrToString(int[][]ary)
    int[][] ary1a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | Return: " + arrToString(ary1a) +  " | Match? " + arrToString(ary1a).equals("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]"));
    int[][] ary2a = {{1, 2}, {4, 5}, {7, 8}};
    System.out.println("Expected: [[1, 2], [4, 5], [7, 8]] | Return: " + arrToString(ary2a) +  " | Match? " + arrToString(ary2a).equals("[[1, 2], [4, 5], [7, 8]]"));
    int[][] ary3a = {{}, {}, {}};
    System.out.println("Expected: [[], [], []] | Return: " + arrToString(ary3a) +  " | Match? " + arrToString(ary3a).equals("[[], [], []]"));
    int[][] ary4a = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
    System.out.println("Expected: [[1, 2, 3, 4], [5, 6], [7, 8, 9, 10, 11]] | Return: " + arrToString(ary4a) +  " | Match? " + arrToString(ary4a).equals("[[1, 2, 3, 4], [5, 6], [7, 8, 9, 10, 11]]"));
    int[][] ary5a = {{1, 2, 3}, {}, {7, 8, 9, 10}};
    System.out.println("Expected: [[1, 2, 3], [], [7, 8, 9, 10]] | Return: " + arrToString(ary5a) +  " | Match? " + arrToString(ary5a).equals("[[1, 2, 3], [], [7, 8, 9, 10]]"));

    //testing arr2DSum
    int[][] ary1b = {{1, 2, 3, 4}, {5, 6, 7, 8,}, {9, 10, 11, 12}};
    System.out.println("Expected: 78 | Return: " + arr2DSum(ary1b) + " | Match? " + (arr2DSum(ary1b) == 78));
    int[][] ary2b = {{1, 2, 3}, {5, 6}, {9, 10, 11, 12}};
    System.out.println("Expected: 59 | Return: " + arr2DSum(ary2b) + " | Match? " + (arr2DSum(ary2b) == 59));
    int[][] ary3b = {{1}, {5, 8}, {}};
    System.out.println("Expected: 14 | Return: " + arr2DSum(ary3b) + " | Match? " + (arr2DSum(ary3b) == 14));
    int[][] ary4b = {{}, {}, {0}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary4b) + " | Match? " + (arr2DSum(ary4b) == 0));
    int[][] ary5b = {{0, 0, 0, 0}, {0, 0}, {0, 0, 0}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary5b) + " | Match? " + (arr2DSum(ary5b) == 0));
    int[][] ary6b = {{}, {}, {}};
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary6b) + " | Match? " + (arr2DSum(ary6b) == 0));

  }

}
