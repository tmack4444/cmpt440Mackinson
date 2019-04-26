public class TrafficLight{
  public static int[][] delta = {
    /*q0*/ {3, 1, 3},
    /*q1*/ {0, 3, 2},
    /*q2*/ {3, 1, 3},
    /*q3*/ {3, 3, 3}
  };

  public static int state = 0;
  public static String currInstruction = "";
  public static int nextInd = 0;

  public static void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      switch(c){
        case 'g': nextInd = 0; // Based on my state transition table, g is index 0
          break;
        case 'y': nextInd = 1; // Based on my state transition table, y is index 1
          break;
        case 'r': nextInd = 2; // Based on my state transition table, r is index 2
          break;
        default: state = 3;
          i = in.length();
          break;
      }
      state = delta[state] [nextInd];
    }
    isTerminating();
  }

    public static void isTerminating(){
      if(state == 0 || state == 2){
        System.out.println("That is a solution.");
      } else {
        System.out.println("That is not a solution.");
      }
    }
}
