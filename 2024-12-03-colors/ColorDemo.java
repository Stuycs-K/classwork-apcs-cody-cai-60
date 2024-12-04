public class ColorDemo {

  // some misc codes
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  // color codes
  public static int BLACK = 30;
  public static int RED = 31;
  public static int GREEN = 32;
  public static int YELLOW = 33;
  public static int BLUE = 34;
  public static int MAGENTA = 35;
  public static int CYAN = 36;
  public static int WHITE = 37;

  //modifiers
  public static int BOLD = 1;
  public static int UNDERLINE = 4;
  public static int INVERT = 7;

  // functions

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void reset() {
    System.out.print("\u001b[0m");
    System.out.print(CLEAR_SCREEN);
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  // main
  public static void main (String[] args) {

    // for(int r = 0; r < 256; r+=32){
    //   for(int g = 0; g <= 256; g+=32){
    //     for(int b = 0; b <= 256; b+=32){
    //       System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    //     }
    //   }
    //   System.out.println();
    // }
    for (int i = 0; i < 5; i++) {
      for (int r = 0; r < 192; r+=32) {
        for (int g = 0; g <= 192; g+=32) {
          for (int b = 0; b <= 192; b+=32) {
            System.out.print("\u001b[38;2;"+r+";"+g+";"+b+"m#");
          }
          System.out.print("\u001b[" + BLACK + "m ");
        }
        System.out.println();
      }
    }

    color (WHITE, WHITE);

    // H
    {

      for (int i = 0; i < 7; i+=6) {
        for (int j = 0; j < 6; j++) {
          go(8+j, 9+i);
          System.out.print(" ");
        }
      }

      for (int i = 0; i < 5; i++) {
        go(10, 10+i);
        System.out.print(" ");
      }

    }

    // E
    {

      for (int i = 0; i < 6; i++) {
        go(8+i, 17);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(8, 18+i);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(10, 18+i);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(13, 18+i);
        System.out.print(" ");
      }

    }

    // L (x2)
    {

      for (int i = 0; i < 6; i++) {
        go(8+i, 25);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(13, 26+i);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(8+i, 33);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(13, 34+i);
        System.out.print(" ");
      }

    }

    // O
    {

      for (int i = 0; i < 7; i+=6) {
        for (int j = 0; j < 6; j++) {
          go(8+j, 41+i);
          System.out.print(" ");
        }
      }

      for (int i = 0; i < 6; i+=5) {
        for (int j = 0; j < 5; j++) {
          go(8+i, 42+j);
          System.out.print(" ");
        }
      }

    }

    // W
    {

      for (int i = 0; i < 7; i+=6) {
        for (int j = 0; j < 5; j++) {
          go(20+j, 9+i);
          System.out.print(" ");
        }
      }

      go(25, 10);
      System.out.print(" ");

      go(24, 11);
      System.out.print(" ");

      go(23, 12);
      System.out.print(" ");

      go(24, 13);
      System.out.print(" ");

      go(25, 14);
      System.out.print(" ");

    }

    // O
    {

      for (int i = 0; i < 7; i+=6) {
        for (int j = 0; j < 6; j++) {
          go(20+j, 17+i);
          System.out.print(" ");
        }
      }

      for (int i = 0; i < 6; i+=5) {
        for (int j = 0; j < 5; j++) {
          go(20+i, 18+j);
          System.out.print(" ");
        }
      }

    }

    // R
    {

      for (int i = 0; i < 6; i++) {
        go(20+i, 25);
        System.out.print(" ");
      }

      for (int i = 0; i < 3; i+=2) {
        for (int j = 0; j < 5; j++) {
          go(20+i, 26+j);
          System.out.print(" ");
        }
      }

      go(21, 31);
      System.out.print(" ");

      for (int i = 0; i < 3; i++) {
        go(23+i, 31);
        System.out.print(" ");
      }

    }

    // L
    {

      for (int i = 0; i < 6; i++) {
        go(20+i, 33);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i++) {
        go(25, 34+i);
        System.out.print(" ");
      }

    }

    // D
    {

      for (int i = 0; i < 6; i++) {
        go(20+i, 41);
        System.out.print(" ");
      }

      for (int i = 0; i < 4; i++) {
        go(21+i, 47);
        System.out.print(" ");
      }

      for (int i = 0; i < 6; i+=5) {
        for (int j = 0; j < 5; j++) {
          go(20+i, 42+j);
          System.out.print(" ");
        }
      }

    }

    System.out.print("\u001b[0m");
    go(100, 100);

    if (args[0].equals("reset")) {
      reset();
    }

  }

}
