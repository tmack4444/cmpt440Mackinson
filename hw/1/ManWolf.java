public class ManWolf{
  public static int[][] delta = {
    /*q0*/ {10, 1, 10, 10},
    /*q1*/ {10, 0, 10, 2},
    /*q2*/ {4, 10, 3, 1},
    /*q3*/ {10, 5, 2, 10},
    /*q4*/ {2, 6, 10, 10},
    /*q5*/ {7, 3, 10, 10},
    /*q6*/ {10, 4, 7, 10},
    /*q7*/ {5, 10, 6, 8},
    /*q8*/ {10, 9, 10, 7},
    /*q9*/ {10, 8, 10, 10},
    /*q10*/ {10, 10, 10, 10}
  };

  public static int state = 0;
  public static String currInstruction = "";
  public static int nextInd = 0;

  public static void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      switch(c){
        case 'c': nextInd = 0; // Based on my state transition table, C is index 0
          break;
        case 'g': nextInd = 1; // Based on my state transition table, g is index 1
          break;
        case 'w': nextInd = 2; // Based on my state transition table, w is index 2
          break;
        case 'n': nextInd = 3; // Based on my state transition table, n is index 3
          break;

        default: state = 10; // If there is an invalid character, go to an error state and end
          isTerminating();
          break;
      }

      state = delta[state] [nextInd];
    }
  }

    public static void isTerminating(){
      if(state == 9){
        System.out.println("That is a solution.");
      } else {
        System.out.println("That is not a solution.");
      }
    }
}