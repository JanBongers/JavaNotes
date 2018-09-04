package nl.bongers.C_loops;

public class A_Looping {

    /**
     * There are three basic ways to write loops in Java:
     *
     *  - While loop
     *  - Do-while loop
     *  - For loop
     *
     * While loop is the simplest way to write a loop. It repeatedly executes a statement as long as the condition is true. The
     * condition is checked at the loop START. Since the condition is checked at the start of the loop, the statement may
     * never be executed.
     *
     *  while (condition)
     *      statement;
     *
     *
     * Do-while loop repeatedly executes a statement as long as the condition is true. The condition is checked at the loop END.
     * Since the condition is checked at the end of the loop, the statement is always executed at least once.
     *
     *  do
     *      statement;
     *  while (condition);
     *
     *
     * For loop repeatedly executes a statement as long as the condition is true. The condition is checked at the loop START.
     * The for loop is more of a convenience layout for a while loop. It provides a simplified notation for loop control values.
     *
     *  for (initialize; condition; update)
     *      statement;
     *
     */
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
    }

    /**
     * While loop example with a factorial function
     */
    private static void whileLoop() {
        System.out.println("While loop");

        int val = 5;
        int factor = 1;

        while (val > 1) { //This condition is checked at the START of the loop
            factor *= val--;
        }

        System.out.println("Factor result: " + factor);
        System.out.println();
    }

    /**
     * Do-while loop example
     */
    private static void doWhileLoop() {
        System.out.println("While loop");

        int val = 5;

        do {
            val *= 2;
            System.out.println(val); //The last printed 'val' result will be 160, not 100 because of the check at the END of the loop.
        }
        while (val < 100); //This condition is checked at the END of the loop.

        System.out.println();
    }

    /**
     * For loop example
     */
    private static void forLoop() {
        System.out.println("While loop");

        //This for loop does the same thing as the while loop above, but it stops sooner because it checks condition at the START.
        for (int val = 5; val < 100; val *= 2) {
            System.out.println(val);
        }

        System.out.println();
    }
}
