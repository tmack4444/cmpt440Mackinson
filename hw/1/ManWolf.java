public class ManWolf{
  public String[] [] delta = {
    /*q0*/ {"q10", "q1", "q10", "q10"},
    /*q1*/ {"q10", "q0", "q10", "q2"},
    /*q2*/ {"q4", "q10", "q3", "q1"},
    /*q3*/ {"q10", "q5", "q2", "q10"},
    /*q4*/ {"q2", "q6", "q10", "q10"},
    /*q5*/ {"q7", "q3", "q10", "q10"},
    /*q6*/ {"q10", "q4", "q7", "q10"},
    /*q7*/ {"q5", "q10", "q6", "q8"},
    /*q8*/ {"q10", "q9", "q10", "q7"},
    /*q9*/ {"q10", "q8", "q10", "q10"},
    /*q10*/ {"q10", "q10", "q10", "q10"}
  };

  public static String state = "q0";
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

        default: currState = "q10"; // If there is an invalid character, go to an error state and end
          isTerminating();
          break;
      }

      state = delta[state, nextInd];
       }
     }

    public void isTerminating(){
      if(currState == "q9"){
        System.out.println("That is a solution.");
      } else {
        System.out.println("That is not a solution.");
      }
    }
}