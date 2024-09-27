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
    int ary2Index = 0;
    for (int i = 0; i < result.length; i++) {
      if (i >= ary1.length) {
        result[i] = ary2[ary2Index];
      }
      else {
        result[i] = ary1[i];
      }
      ary2Index++;
    }
    return result;
  }
  public static void main(String[] args) {
    //testing returnCopy
    int[] ary = {1, 9, 7};
    int[] ary2 = returnCopy(ary);
    System.out.println("Array 1: " + arrayToString(ary) + " Array 2: " + arrayToString(ary2) + " Different Copy? " + !(ary == ary2) + " Same Elements? " + arrayToString(ary).equals(arrayToString(ary2)));
    int[] ary3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] ary4 = returnCopy(ary3);
    System.out.println("Array 1: " + arrayToString(ary3) + " Array 2: " + arrayToString(ary4) + " Different Copy? " + !(ary3 == ary4) + " Same Elements? " + arrayToString(ary3).equals(arrayToString(ary4)));
    int[] ary5 = {1, 0, 0, 0, 0, 9};
    int[] ary6 = returnCopy(ary5);
    System.out.println("Array 1: " + arrayToString(ary5) + " Array 2: " + arrayToString(ary6) + " Different Copy? " + !(ary5 == ary6) + " Same Elements? " + arrayToString(ary5).equals(arrayToString(ary6)));
    int[] ary7 = {};
    int[] ary8 = returnCopy(ary7);
    System.out.println("Array 1: " + arrayToString(ary7) + " Array 2: " + arrayToString(ary8) + " Different Copy? " + !(ary7 == ary8) + " Same Elements? " + arrayToString(ary7).equals(arrayToString(ary8)));
    int[] ary9 = {0};
    int[] ary10 = returnCopy(ary9);
    System.out.println("Array 1: " + arrayToString(ary9) + " Array 2: " + arrayToString(ary10) + " Different Copy? " + !(ary9 == ary10) + " Same Elements? " + arrayToString(ary9).equals(arrayToString(ary10)));

    //testing concatArray


  }
}
