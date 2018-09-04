package nl.bongers.B_conditional;

public class C_IfElseStatement {

    /**
     * If-else statement. An IF statement conditionally executes a statement, rather than just returning a value.
     *
     *  if (condition) {
     *      true-statement;
     *  }
     *
     * The example above will execute the statement within the brackets if the statement of 'condition' is true. If the
     * condition is false, it will skip over the true-statement.
     *
     *  if (condition) {
     *      true-statement;
     *  } else {
     *      false-statement;
     *  }
     *
     * The optional ELSE clause executes a statement when the IF condition is false.
     *
     */
    public static void main(String[] args) {
        ifStatement();
        ifElseStatement();
        chainingStatements();
        nestedStatements();
        variableScope();
    }

    /**
     * IF statement examples. Both false and true conditions of the IF statement are demonstrated.
     */
    private static void ifStatement() {
        System.out.println("If statement");

        int v1 = 10;
        int v2 = 20;

        if (v1 < v2) {
            System.out.println("The condition of the IF statement is true. This will be printed");
        }

        if (v1 > v2) {
            System.out.println("The condition of the IF statement is false. This will not be printed");
        }

        System.out.println();
    }

    /**
     * IF-ELSE statement examples. A false conditions of the IF statement ans the ELSE statement are demonstrated.
     */
    private static void ifElseStatement() {
        System.out.println("If-else statement");

        int v1 = 20;
        int v2 = 30;

        if (v1 > v2) {
            System.out.println("The condition of the IF statement is false. This will not be printed");
        } else {
            System.out.println("Condition of the IF statement is false, so the Else statement will be printed.");
        }

        System.out.println();
    }

    /**
     * Chaining IF-ELSE statements. Often times you will need more than just 'IF condition ELSE other-condition'.
     * You may have multiple things you need to evaluate. IF-ELSE statements chained together are evaluated in order
     * until one of the IF statements is true or until the optional ELSE statement.
     *
     *  if (condition-1) {
     *      true-statement-1;
     *  } else if (condition-2) {
     *      true-statement-2;
     *  } else if (conditon-N) {
     *      true-statement-N;
     *  } else {
     *      false-statement;
     *  }
     *
     * There is no limit for chaining IF-ELSE statement. It can be done as many times as you want. It is advisable to limit
     * the chaining to an acceptable amount for readability, complexity and testing purposes.
     *
     */
    private static void chainingStatements() {
        System.out.println("Chaining statements");

        int v1 = 10;
        int v2 = 40;

        if (v1 > v2) {
            System.out.println("This condition is evaluated first. Since the result is false, this will not be printed");
        } else if (v1 < v2) {
            System.out.println("This condition is evaluated second. Since the result is true, this will be printed");
        } else {
            System.out.println("The ELSE statement is always evaluated last. Since there is a true result in the chain, this will not be printed");
        }

        System.out.println();
    }

    /**
     * IF statements can be nested. A true-statement of a true condition can be an IF-statement as well. As is with chaining, it is
     * advisable to limit the nesting for readability, complexity and testing purposes.
     */
    private static void nestedStatements() {
        System.out.println("Nested statements");

        int v1 = 20;

        if (v1 > 5) { //first evaluation
            if (v1 > 10) { //Will be executed as the true-statement of 'first evaluation'
                if (v1 == 15) {
                    System.out.println("Condition is false. This will be printed");
                } else if (v1 == 20) {
                    System.out.println("Nested condition is true. This will be printed");
                }
            }
        }

        System.out.println();
    }

    /**
     * A variable declared within a statement block is not visible or accessible outside of the statement block
     *
     * boolean isVisible = true;
     *
     * if (isVisible) {
     *     boolean notVisible = true; --> This variable is only visible in this statement block;
     * }
     *
     */
    private static void variableScope() {
        System.out.println("Variable scope");

        float devices = 30.0f;
        float rooms = 4.0f;

        if (rooms > 0.0) {
            float avg = devices / rooms;
            System.out.println(avg);
        }
        //We can not print avg here since it is outside of the statement block. The variable 'avg' simply does not exist here
        //because it is declared in another scope and does not exist in this scope / outside the statement block scope.
        //System.out.println(avg);
    }
}
