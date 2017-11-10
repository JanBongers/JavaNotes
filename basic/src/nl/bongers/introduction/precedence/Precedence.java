package nl.bongers.introduction.precedence;

public class Precedence {

    /**
     * -- Operator precedence
     *
     * Operators are evaluated in a defined order:
     *
     *      1: Postfix (val++, val--)
     *      2: Prefix (++val, --val)
     *      3: Multiplicative (* / %)
     *      4: Additive (+ -)
     *
     * Operators of equal precedence are evaluated left-to-right: 1 + 2 + 3, + is of equal precedence)
     * You can override a precedence with parenthesis: (1 + 2) / 3, the additive in parenthesis overrides the precedence
     * of the multiplicative. (1 + 2) will be evaluated first now. Nested parenthesis are evaluated from the inside out.
     */
    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        //Divide will be evaluated first because of the higher defined order. Result1 will be 19
        int result1 = valA - valB / valC;

        //Parenthesis overrides the defines order, additive will be evaluated first. Result2 will be 5
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        /*
        * Multiplicative comes before additive, equal precedence operations are left-to-right. Result3 will be 13
        * Order of operation:
        *       valA / valC, 2 -> 7
        *       7 * valD -> 7
        *       7 + valB -> 13
        */
        int result3 = valA / valC * valD + valB;

        /*
        * Nested parenthesis. Most inner one will be evaluated first, followed by the next most inner one. Result4 will be 1
        * Order of operation:
        *       valD + valB -> 7
        *       7 * valC -> 21
        *       valA / 21 -> 1
         */
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);
    }
}
