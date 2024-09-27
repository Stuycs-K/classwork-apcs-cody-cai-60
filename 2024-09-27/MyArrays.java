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
    return 0;
  }
  public static int[] concatArray (int[] ary1, int[] ary2) {
    return 0;
  }
  public static void main(String[] args) {
    //testing returnCopy
    int[] ary = {1, 9, 7};
    int[] ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + "Same? " + ary != ary2);
    ary = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + "Same? " + ary != ary2);
    ary = {1, 0, 0, 0, 0, 9};
    ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + "Same? " + ary != ary2);
    ary = {};
    ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + "Same? " + ary != ary2);
    ary = {0};
    ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + "Same? " + ary != ary2);

    //testing concatArray


  }
}
