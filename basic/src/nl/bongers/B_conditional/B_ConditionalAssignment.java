package nl.bongers.B_conditional;

public class B_ConditionalAssignment {

    /**
     * Conditional assignment. Assigns a value to a variable based on the result of a condition
     *
     * result = condition ? true-value : false-value;
     *      - result = true ? OK : NOK; --> result is OK.
     *      - result = false ? OK : NOK; --> result is NOK.
     *      - result = 2 > 1 ? 'Y' : 'N' --> result is 'Y';
     *
     * @param args
     */
    public static void main(String[] args) {
        conditionalAssignment();
    }

    private static void conditionalAssignment() {
        System.out.println("Conditional assignment");

        //Integer example
        final int v1 = 7;
        final int v2 = 5;

        //Checks if v1 is greater than v2. Result of this operator is true, thus the value of v2 is assigned to result.
        //Printed value will be 5.
        final int result = v1 > v2 ? v2 : v1;
        System.out.println(result);

        //Float example
        final float devices = 30;
        final float rooms = 4;

        //Checks if rooms is equal to 0. Result of this operator is false, thus the value of 'devices/rooms' is assigned to result.
        //Printed value will be 7.5.
        final float devicesPerRoom = rooms == 0.0f ? 0.0f : devices/rooms;
        System.out.println(devicesPerRoom);
    }
}
