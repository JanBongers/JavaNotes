package nl.bongers.B_conditional;

public class A_RelationalOperator {

    /**
     * Relational operators allow us to test values against one another. All relational operators return a boolean as the result.
     * There are six types of relational operators:
     *      - Greater than
     *      - Greater than or equal to
     *      - Less than
     *      - Less than or equal to
     *      - Equal to
     *      - Not equal to
     *
     */
    public static void main(String[] args) {
        greaterThan();
        greaterThanOrEqualTo();
        lessThan();
        lessThanOrEqualTo();
        equalTo();
        notEqualTo();
    }

    /**
     * Greater than relational operator. Tests if the first value is larger than the second value.
     *
     *  - Operator: >
     *  - Integer example: 5 > 4
     *  - Character example: 'c' > 'a' --> Uses the different unicode code point
     *  - Boolean example: not available
     *
     */
    private static void greaterThan() {
        System.out.println("Greater than operator");

        System.out.println(5 > 4);
        System.out.println('c' > 'a');
    }


    /**
     * Greater than or equal to relational operator. Tests if the first value is larger than the
     * second value or if both values are the same.
     *
     *  - Operator: >=
     *  - Integer example:
     *      5 >= 4
     *      4 >= 4
     *  - Character example:
     *      'c' >= 'a'
     *      'a' >= 'a'
     *  - Boolean example: not available
     */
    private static void greaterThanOrEqualTo() {
        System.out.println("Greater than or equal to operator");

        System.out.println(5 >= 4);
        System.out.println(4 >= 4);
        System.out.println('c' >= 'a');
        System.out.println('a' >= 'a');
    }

    /**
     * Less than relational operator. Tests if the first value is smaller than the second value.
     *
     *  - Operator: <
     *  - Integer example: 4 < 5
     *  - Character example: 'a' < 'c' --> Uses the different unicode code point
     *  - Boolean example: not available
     */
    private static void lessThan() {
        System.out.println("Less than operator");

        System.out.println(4 < 5);
        System.out.println('a' < 'c');
    }

    /**
     * Less than or equal to relational operator. Tests if the first value is smaller than the
     * second value or if both values are the same.
     *
     *  - Operator: <=
     *  - Integer example:
     *      4 <= 5
     *      4 <= 4
     *  - Character example:
     *      'a' <= 'c'
     *      'a' <= 'a'
     *  - Boolean example: not available
     */
    private static void lessThanOrEqualTo() {
        System.out.println("Less than or equal to operator");

        System.out.println(4 <= 5);
        System.out.println(4 <= 4);
        System.out.println('a' <= 'c');
        System.out.println('a' <= 'a');
    }

    /**
     * Equal to relational operator. Tests is both values are the same.
     *
     *  - Operator: ==
     *  - Integer example: 5 == 5
     *  - Character example: 'c' == 'c'
     *  - Boolean example: false == false
     */
    private static void equalTo() {
        System.out.println("Equal to operator");

        System.out.println(5 == 5);
        System.out.println('c' == 'c');
        System.out.println(false == false);
        System.out.println(true == true);
    }

    /**
     * Not equal to relational operator. Tests if the values are different.
     *
     *  - Operator !=
     *  - Integer example: 4 != 5
     *  - Character example: 'a' != 'c'
     *  - Boolean example : true != false
     */
    private static void notEqualTo() {
        System.out.println("Not equal to operator");

        System.out.println(4 != 5);
        System.out.println('a' != 'c');
        System.out.println(true != false);
    }
}
