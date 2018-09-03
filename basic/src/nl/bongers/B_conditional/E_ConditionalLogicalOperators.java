package nl.bongers.B_conditional;

public class E_ConditionalLogicalOperators {

    /**
     * Conditional logical operators. There are two special logical operators called conditional logical operators. There
     * is a conditional AND and a conditional OR. Conceptually, there resolve the same way as the other logical AND and OR operators.
     * The difference is that conditional logical operators only execute the second / right side of their statement / test if
     * they need to do that to determine the result.
     *
     * Conditional AND
     *  - Operator: &&
     *  - Example:
     *      true && true --> result is true, both sides are executed.
     *      true && false --> result is false, both sides are executed.
     *      false && true --> result is false, only the left side is executed.
     *
     *  Both sides have to be true. The right side will only be executed if the left side is true. If the left side is false,
     *  it is not needed to execute the right side, because we already know the AND operator will return false.
     *
     *
     * Conditional OR
     *  - Operator: ||
     *  - Example:
     *      true || true --> result is true, only the left side is executed
     *      true || false --> result is true, only the left side is executed.
     *      false || true --> result is true, both sides are executed.
     *      false || false --> result is false, both sides are executed.
     *
     *  Only one side has to be true. If the left side is true, we already know we are done and that the OR operator
     *  will return true. Only if the left side is false, it is needed to check if the right side is true.
     *
     */
    public static void main(String[] args) {
        conditionalAndOperator();
        conditionalOrOperator();
    }

    private static void conditionalAndOperator() {
        System.out.println("Conditional AND logical operator");

        final int a = 20, b = 14, c = 5;
        if (a > b && b > c) {
            System.out.println("Both sides are executed. This will be printed");
        }

        if (c > a && a > b) {
            System.out.println("Only the left side is executed. Since it is false and an AND statement, it is not needed to execute the right side");
        }

        System.out.println();
    }

    private static void conditionalOrOperator() {
        System.out.println("OR logical operator");

        final int a = 20, b = 14, c = 5;
        if (a > b || b > c) {
            System.out.println("Only the left side is executed. Since is is true and an OR statement, it is not needed to execute the right side");
        }

        if (c > a || a > b) {
            System.out.println("Both sides are executed since the left side is false, thus it is needed to check the right side");
        }

        System.out.println();
    }
}
