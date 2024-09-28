public class MyArrays {

  public static String arrayToString (int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  public static int[] returnCopy (int[] ary) {
    int[] result = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      result[i] = ary[i];
    }
    return result;
  }

  public static int[] concatArray (int[] ary1, int[] ary2) {
    int[] result = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      result[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      result[ary1.length+i] = ary2[i];
    }
    return result;
  }

  public static void main(String[] args) {

    //testing returnCopy
    int[] ary1 = {1, 9, 7};
    System.out.println("Expected: true, true | Result: Different Copy? " + !(ary1 == returnCopy(ary1)) + " | Same Elements? " + arrayToString(ary1).equals(arrayToString(returnCopy(ary1))));
    int[] ary2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println("Expected: true, true | Result: Different Copy? " + !(ary1 == returnCopy(ary2)) + " | Same Elements? " + arrayToString(ary2).equals(arrayToString(returnCopy(ary2))));
    int[] ary3 = {1, 0, 0, 0, 0, 9};
    System.out.println("Expected: true, true | Result: Different Copy? " + !(ary1 == returnCopy(ary3)) + " | Same Elements? " + arrayToString(ary3).equals(arrayToString(returnCopy(ary3))));
    int[] ary4 = {};
    System.out.println("Expected: true, true | Result: Different Copy? " + !(ary1 == returnCopy(ary4)) + " | Same Elements? " + arrayToString(ary4).equals(arrayToString(returnCopy(ary4))));
    int[] ary5 = {0};
    System.out.println("Expected: true, true | Result: Different Copy? " + !(ary1 == returnCopy(ary5)) + " | Same Elements? " + arrayToString(ary5).equals(arrayToString(returnCopy(ary5))));

    //testing concatArray
    int[] ary1a = {27, 10, 15};
    int[] ary1b = {17, 25, 32};
    String result1 = arrayToString(concatArray(ary1a, ary1b));
    System.out.println("Expected: [27, 10, 15, 17, 25, 32] | Result: " + result1 + " | Match? " + result1.equals("[27, 10, 15, 17, 25, 32]"));
    int[] ary2a = {1, 2, 3};
    int[] ary2b = {1, 9, 7, 6};
    String result2 = arrayToString(concatArray(ary2a, ary2b));
    System.out.println("Expected: [1, 2, 3, 1, 9, 7, 6] | Result: " + result2 + " | Match? " + result2.equals("[1, 2, 3, 1, 9, 7, 6]"));
    int[] ary3a = {0, 1, 2, 3, 4, 5, 6};
    int[] ary3b = {7, 8, 9, 10};
    String result3 = arrayToString(concatArray(ary3a, ary3b));
    System.out.println("Expected: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | Result: " + result3 + " | Match? " + result3.equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"));
    int[] ary4a = {};
    int[] ary4b = {11, 55, 22};
    String result4 = arrayToString(concatArray(ary4a, ary4b));
    System.out.println("Expected: [11, 55, 22] | Result: " + result4 + " | Match? " + result4.equals("[11, 55, 22]"));
    int[] ary5a = {28, 14, 45};
    int[] ary5b = {};
    String result5 = arrayToString(concatArray(ary5a, ary5b));
    System.out.println("Expected: [28, 14, 45] | Result: " + result5 + " | Match? " + result5.equals("[28, 14, 45]"));
    int[] ary6a = {};
    int[] ary6b = {};
    String result6 = arrayToString(concatArray(ary6a, ary6b));
    System.out.println("Expected: [] | Result: " + result6 + " | Match? " + result6.equals("[]"));

  }
}
