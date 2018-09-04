package nl.bongers.C_loops;

public class D_SwitchStatement {

    /**
     * Switch statement. Switch transfers control to a particular statement based on a value. It simplifies testing
     * against multiple possible matches. The only primitive types that can be used with a switch are char and int.
     * Other types of values that can be used will be covered later. A case-match can execute more than one statement.
     * Once a switch matches a case, it will keep running all the cases / statements from below the matching case all the way
     * to the end of the switch statement. To avoid the so called 'falling through', we need to use the 'break' keyword. The
     * optional 'default' keyword can be used to handle any unmatched values.
     *
     *  switch (test-value) {
     *      case value-1:
     *          statements;
     *      case value-2:
     *          statements;
     *      case value-n:
     *          statements;
     *          break;
     *      default:
     *          statements;
     *  }
     *
     */
    public static void main(String[] args) {
        System.out.println("Switch statement");

        /*
        case 0 will be matched in the switch statement below, but it will still execute case 1 and default. This
        is because once a switch matches a case, it will keep running all the cases / statements from below the matching case all the way
        to the end, as stated above. We will add the 'break' keywords to prevent this in the second example.
        With break the code will 'jump out' of the switch statement.
         */

        System.out.println("Without 'break'");
        int val = 10;
        switch (val % 2) { //Modulus 2 will always result in 0 or 1. Good test if a value is odd or even.
            case 0: //All even numbers will have a value of 0
                System.out.println(val + " is even");
            case 1: //All odd numbers will have a value of 1
                System.out.println(val + " is odd");
            default:
                System.out.println("Broken. Should never be printed in this scenario");

        }
        System.out.println();

        /*
        Same as in the first example, but with the 'break' keywords in place. This time, only case 0 will be executed
         */
        System.out.println("With 'break'");
        int otherVal = 10;
        switch (otherVal % 2) {
            case 0:
                System.out.println(val + " is even");
                break;
            case 1:
                System.out.println(val + " is odd");
                break;
            default:
                System.out.println("Broken. Should never be printed in this scenario");
                break; //not needed since its the last section, but is it good programming practice

        }
    }
}
