import java.util.ArrayList;

public class Driver {

  public static void main (String[] args) {

    int testNum = 0;
    String testName = "";

    ArrayList<String> a, b, c, d, e, f;

    //Test Case #1

    testNum++;
    testName = "createRandomArray";
    try {
      a = ArrayListPractice.createRandomArray(5);
      b = ArrayListPractice.createRandomArray(2);
      c = ArrayListPractice.createRandomArray(10);
      d = ArrayListPractice.createRandomArray(27);
      e = ArrayListPractice.createRandomArray(15);
      f = ArrayListPractice.createRandomArray(200000);
      if ((a.size() == 5) && (b.size() == 2) && (c.size() == 10) && (d.size() == 27) && (e.size() == 15) && (f.size() == 200000)) {
        System.out.println(testNum + ". PASS " + testName);
      } else {
        System.out.println(testNum + ". FAIL " + testName);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
      }
    } catch (Exception x){
      System.out.println(testNum + ". Exception " + testName);
      x.printStackTrace();
    }

    //Test Case #2

    testNum++;
    testName = "replaceEmpty";
    System.out.println("\n" + testNum + ". " + testName);
    try {
      a = ArrayListPractice.createRandomArray(20);
      b = ArrayListPractice.createRandomArray(20);
      c = ArrayListPractice.createRandomArray(20);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      ArrayListPractice.replaceEmpty(a);
      ArrayListPractice.replaceEmpty(b);
      ArrayListPractice.replaceEmpty(c);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    } catch (Exception x){
      System.out.println(testNum + ". Exception " + testName);
      x.printStackTrace();
    }

    //Test Case #3

    testNum++;
    testName = "makeReversedList";
    System.out.println("\n" + testNum + ". " + testName);
    try {
      a = ArrayListPractice.createRandomArray(5);
      b = ArrayListPractice.createRandomArray(2);
      c = ArrayListPractice.createRandomArray(10);
      d = ArrayListPractice.createRandomArray(27);
      e = ArrayListPractice.createRandomArray(15);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println("\n Reversed Lists \n");
      a = ArrayListPractice.makeReversedList(a);
      b = ArrayListPractice.makeReversedList(b);
      c = ArrayListPractice.makeReversedList(c);
      d = ArrayListPractice.makeReversedList(d);
      e = ArrayListPractice.makeReversedList(e);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
    } catch (Exception x){
      System.out.println(testNum + ". Exception " + testName);
      x.printStackTrace();
    }

    //Test Case #4

    testNum++;
    testName = "mixLists";
    System.out.println("\n" + testNum + ". " + testName);
    try {
      a = ArrayListPractice.createRandomArray(5);
      b = ArrayListPractice.createRandomArray(5);
      c = ArrayListPractice.createRandomArray(10);
      d = ArrayListPractice.createRandomArray(15);
      e = ArrayListPractice.createRandomArray(20);
      f = ArrayListPractice.createRandomArray(12);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println("\n Mixed Lists \n");
      ArrayList<String> mixed1 = ArrayListPractice.mixLists(a, b);
      ArrayList<String> mixed2 = ArrayListPractice.mixLists(c, d);
      ArrayList<String> mixed3 = ArrayListPractice.mixLists(e, f);
      System.out.println(mixed1);
      System.out.println(mixed2);
      System.out.println(mixed3);
    } catch (Exception x){
      System.out.println(testNum + ". Exception " + testName);
      x.printStackTrace();
    }

  }

}
