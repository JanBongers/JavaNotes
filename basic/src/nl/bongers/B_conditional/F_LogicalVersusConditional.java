package nl.bongers.B_conditional;

public class F_LogicalVersusConditional {

    /**
     * A demo to compare the behavious of a logical AND to that of a conditional logical AND.
     */
    public static void main(String[] args) {
        final int people = 150;
        final int rooms = 0;

        //This statement can NOT be executed and will result in an exception: can not divide by zero. This is because
        //the logical AND operator will always evaluate both sides. Uncomment the code (remove // in front of the code) to see this result.

        //if (rooms > 0 & people/rooms > 30) {
        //    System.out.println("Too many!");
        //}

        //This statement CAN be executed because it will always check the left side first. Since this is false, it will not
        //execute the right side because it is not needed to know the answer of the AND statement (result is false).
        if (rooms > 0 && people/rooms > 30) {
            System.out.println("Too many!");
        }
    }
}
