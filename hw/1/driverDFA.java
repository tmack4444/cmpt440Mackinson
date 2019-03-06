class dfa{
    public static void main(String[] args) {
       public static int[] [] delta = {
         /*q0*/ {q10, q1, q10, q10},
         /*q1*/ {q10, q0, q10, q2},
         /*q2*/ {q4, q10, q3, q1},
         /*q3*/ {q10, q5, q2, q10},
         /*q4*/ {q2, q6, q10, q10},
         /*q5*/ {q7, q3, q10, q10},
         /*q6*/ {q10, q4, q7, q10},
         /*q7*/ {q5, q10, q6, q8},
         /*q8*/ {q10, q9, q10, q7},
         /*q9*/ {q10, q8, q10, q10},
         /*q10*/ {q10, q10, q10, q10}
       };

       public static currState = q0;
       public static String currInstruction = "";
            
      public void process (String in){
        for (int i = 0; i < in.length(); i++) {
          try{
            state = delta[state] [-'0'];
          } catch (ArrayIndexOutOfBoundsException ex) {
            state = q10;
          }
        }
      }

      public void isTerminating(){
        if(currState == q9){
          return "That is a solution.";
        } else {
          return "That is not a solution.";
        }

      }
    }
}