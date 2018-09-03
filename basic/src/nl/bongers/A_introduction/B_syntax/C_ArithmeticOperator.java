package nl.bongers.A_introduction.B_syntax;

public class C_ArithmeticOperator {

    /**
     * Java provides three basic categories of operators for performing math operations:
     *      - Basic operators
     *      - Prefix / postfix operators
     *      - Compound assignment operators
     */
    public static void main(String[] args) {
        basicMathOperators();
        prefixPostfixOperators();
        compoundAssignmentOperators();
    }

    /**
     * -- Basic math operators --
     * As the name suggest, these are the most basic operators and are just what you would expect.
     * There are five types of basic math operators:
     *
     * Add
     *  - Operator: +
     *  - Integer example: 1 + 2 (value will be 3)
     *  - Floating point example: 1.0 + 2.0 (value will be 3.0)
     *
     * Subtract
     *  - Operator: -
     *  - Integer example: 5 - 4 (value will be 1)
     *  - Floating point example: 5.0 - 4.0 (value will be 1.0)
     *
     * Multiply
     *  - Operator: *
     *  - Integer example: 4 * 2 (value will be 8)
     *  - Floating point example: 4.0 * 2.0 (value will be 8.0)
     *
     * Divide
     *  - Operator: /
     *  - Integer example: 13 / 5 (value will be 2!)
     *  - Floating point example: 13.0 / 5.0 (value will be 2.6)
     *  - Note: Integer does not have fractional portions, thus it will be dropped as shown above.
     *
     * Modulus - Also known as 'Remainder'
     *  - Operator: %
     *  - Integer example: 13 % 5 (value will be 3)
     *  - Floating point example: 13.0 % 5.0 (value will be 3.0)
     */
    private static void basicMathOperators() {
        System.out.println("Basic math operators");

        System.out.println("Add");
        System.out.println(1 + 2);
        System.out.println(1.0 + 2.0);
        System.out.println();

        System.out.println("Subtract");
        System.out.println(5 - 4);
        System.out.println(5.0 - 4.0);
        System.out.println();

        System.out.println("Multiply");
        System.out.println(4 * 2);
        System.out.println(4.0 * 2.0);
        System.out.println();

        System.out.println("Divide");
        System.out.println(13 / 5);
        System.out.println(13.0 / 5.0);
        System.out.println();

        System.out.println("Modulus");
        System.out.println(13 % 5);
        System.out.println(13.0 % 5.0);
        System.out.println();
    }

    /**
     * Prefix / postfix operators allows us to directly operate on a value:
     *
     *  ++ increments value by 1
     *  -- decrements value by 1
     *
     */
    private static void prefixPostfixOperators() {
        System.out.println("prefix / postfix operators");

        // Prefix applies operation before returning the value. Both printed values will be 6
        int val = 5;
        System.out.println(++val);
        System.out.println(val);

        //Postfix applies operation after returning the value. First printed value will be 5, second will be 6.
        int otherVal = 5;
        System.out.println(otherVal++);
        System.out.println(otherVal);

        System.out.println();
    }

    /**
     * Compound assignment operators combines operation and assignment: applies result of the right side
     * to the left side and stores that result in the variable on the left side.
     *
     * Compound assignment operators are available for all five basic math operators:
     *      - +=
     *      - -=
     *      - *=
     *      - /=
     *      - %=
     */
    private static void compoundAssignmentOperators() {
        System.out.println("Compound operators");

        int val = 50;
        val -= 5;
        System.out.println(val);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        result /= val1 * val2;
        System.out.println(result);

        System.out.println();
    }
}
