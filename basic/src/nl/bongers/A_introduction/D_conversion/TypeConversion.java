package nl.bongers.A_introduction.D_conversion;

public class TypeConversion {

    /**
     * There are two types of conversions: Implicit and explicit type conversion.
     *
     * Implicit type conversion:
     *      - Conversions performed automatically by the compiler
     *      - Widening -> Moving to a wider data type (e.g. from int to long)
     *      - Equations will always use the largest data type. Comparing int with long will convert the int to a long value
     *
     * Explicit type conversion:
     *      - Conversions performed explicitly in code with casting
     *      - Widening and narrowing -> Moving to a wider or smaller data type
     *      - Floating point to integer drops the fraction
     *
     */
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        //Both are accepted as they both are Widening from byte to short
        short result1 = byteVal;
        short result2 = (short) byteVal;

        System.out.println(result1);
        System.out.println(result2);

        //Only casting is accepted with narrowing from long to short
        short result3 = (short) longVal;
        System.out.println(result3);

        //Largest data type will be used in an equation, so this is narrowing from long to short
        //and thus casting is needed. Wrapping in parenthesis to cast the result of equation instead of just byteVal.
        short result4 = (short) (byteVal - longVal);
        System.out.println(result4);

        //Floating point will be used in this equation to contain the fraction. Casting to long is needed.
        long result5 = (long) (longVal - floatVal);
        System.out.println(result5);

        //Implicit, no casting needed
        double result6 = longVal - doubleVal;
        System.out.println(result6);

        //Explicit from floating point to long, casting needed.
        long result7 = (long) (shortVal - longVal + floatVal + doubleVal);
        System.out.println(result7);
    }
}
