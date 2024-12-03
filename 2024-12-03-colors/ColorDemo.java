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
  public static int RESET = 0;

  //modifiers
  public static int BOLD = 1;
  public static int UNDERLINE = 4;
  public static int INVERT = 7;

  // print colors
  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void colorRGB(int type, int redVal, int greenVal, int blueVal) {
    System.out.print( "\u001b[" + type + ";2" + ";" + redVal + ";" + greenVal + ";" + blueVal + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  public static void main (String[] args) {



  }

}
