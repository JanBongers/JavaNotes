package nl.bongers.B_conditional;

public class D_LogicalOperators {

    /**
     * Logical operators are useful for arriving in a true or false value by operating on other statements to
     * provide true of false values. They could be boolean variables, but more commonly, logical operators
     * are used to work on the results of other relational operations.
     * TD;DR: Evaluate multiple statements for true or false
     *
     * There are four fundamental logical operators:
     *
     * AND
     *  - Operator: &
     *  - Example:
     *          true & true --> result is true
     *          true & false --> result is false
     *  - If both statements / sides are true, the result will be true
     *
     * OR
     *  - Operator: |
     *  - Example:
     *      true | false --> result is true
     *      false | true --> result is true
     *      true | true --> result is true
     *  - Only one statement / side needs to be true for the result to be true
     *
     * Exclusive OR (XOR)
     *  - Operator: ^
     *  - Example:
     *      true ^ false --> result is true
     *      false ^ true --> result is true
     *      true ^ true --> result is false
     *  - Exactly one side needs to be true. Of both sides are true, the result will be false.
     *
     * Negation
     *  - Operator: !
     *  - Example:
     *      boolean done = false;
     *      !done = true;
     *  - Negation reverses the result. It evaluates is something is NOT the condition, NOT false is true.
     */
    public static void main(String[] args) {
        andOperator();
        orOperator();
        exclusiveOrOperator();
        negationOperator();
    }

    /**
     * AND logical operator example.
     */
    private static void andOperator() {
        System.out.println("AND logical operator");

        final int a = 20, b = 14, c = 5;
        if (a > b & b > c) {
            System.out.println("a is greater than b AND b is greater than c. This will be printed");
        }

        if (a > b & c > a) {
            System.out.println("a is greater than b, but c is not greater than a. This will not be printed");
        }

        System.out.println();
    }

    /**
     * OR logical operator example.
     */
    private static void orOperator() {
        System.out.println("OR logical operator");

        final int a = 20, b = 14, c = 5;
        if (a > b | b > c) {
            System.out.println("a is greater than b OR b is greater than c. This will be printed");
        }

        if (a > b | c > a) {
            System.out.println("Only one statement / side is true, but since this is an OR statement, this will also be printed");
        }

        System.out.println();
    }

    /**
     * Exclusive OR logical operator example.
     */
    private static void exclusiveOrOperator() {
        System.out.println("Exclusive OR logical operator");

        final int a = 20, b = 14, c = 5;
        if (a > b ^ b > c) {
            System.out.println("a is greater than b, but b is also greater than c. This will not be printed");
        }

        if (a > b ^ c > a) {
            System.out.println("a is greater than b and c is NOT greater than a, this will be printed");
        }

        System.out.println();
    }

    private static void negationOperator() {
        System.out.println("Negation logical operator");
        final boolean visible = false;
        final boolean finished = true;

        if (!visible) { //Reversed result. visible is false, the NOT of false, is true. Statement is true
            System.out.println("Boolean is indeed NOT true");
        }

        if (!finished) { //Reversed result. finished is true, thus NOT false. Statement is false
            System.out.println("Boolean is NOT false, thus true. This will not be printed");
        }
    }
}
