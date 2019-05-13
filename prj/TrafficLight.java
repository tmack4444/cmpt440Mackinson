public class TrafficLight{
  public static int[][] delta = {
    /*q0*/ {10, 1, 10, 6, 10},
    /*q1*/ {10, 10, 2, 7, 10},
    /*q2*/ {3, 10, 10, 10, 10},
    /*q3*/ {10, 4, 10, 8, 10},
    /*q4*/ {10, 10, 5, 9, 10},
    /*q5*/ {0, 10, 10, 10, 10},
    /*q6*/ {10, 10, 10, 10, 0},
    /*q7*/ {10, 10, 10, 10, 1},
    /*q8*/ {10, 10, 10, 10, 3},
    /*q9*/ {10, 10, 10, 10, 4},
    /*q10*/{10, 10, 10, 10, 10},
  };

  public static int state = 0;
  public static String currInstruction = "";
  public static int nextInd = 0;

  public static void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = Character.toUpperCase(in.charAt(i));
      switch(c){
        case 'G': nextInd = 0; // Based on my state transition table, g is index 0
          break;
        case 'Y': nextInd = 1; // Based on my state transition table, y is index 1
          break;
        case 'R': nextInd = 2; // Based on my state transition table, r is index 2
          break;
        case 'F': nextInd = 3; // Based on my state transition table, r is index 2
          break;
        case 'S': nextInd = 4; // Based on my state transition table, r is index 2
          break;
        default: state = 10;
          i = in.length();
          break;
      }
      state = delta[state] [nextInd];
    }
    isTerminating();
  }

    public static void isTerminating(){
      System.out.println(state);
      if(state == 0 || state == 3 || state == 6 || state == 7 || state == 8 || state == 9){
        System.out.println("That is a solution.");
      } else {
        System.out.println("That is not a solution.");
      }
    }
}
