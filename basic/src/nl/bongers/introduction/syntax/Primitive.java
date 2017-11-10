package nl.bongers.introduction.syntax;

public class Primitive {

    /**
     * Primitive data types are the foundation of all other types. All primitive types are stored by value.
     * There are four categories of primitive types:
     *      - Integer
     *      - Floating point
     *      - Character
     *      - Boolean
     */
    public static void main(String[] args) {
        primitiveIntegerTypes();
        primitiveFloatingPointTypes();
        primitiveCharacterType();
        primitiveBooleanType();
    }

    /**
     * -- Primitive integer types --
     * The difference between the integer types are the size of storage they take up, which affects
     * the range of values that can be stored by the specified type.
     *
     * byte
     *  - size: 8 bits
     *  - min value: -128
     *  - max value: 127
     *  - Literal format: 0
     *
     * short
     *  - size: 16 bits
     *  - min value: -32768
     *  - max value: 32767
     *  - Literal format: 0
     *
     * int
     *  - size: 32 bits
     *  - min value: -2147483648
     *  - max value: 2147483647
     *  - Literal format: 0
     *
     * long
     *  - size: 64 bits
     *  - min value: -9223372036854775808
     *  - max value: 9223372036854775807
     *  - Literal format: 0L
     */
    private static void primitiveIntegerTypes() {

        byte byteType = 0;
        short shortType = 0;
        int intType = 0;
        long longType = 0L;

    }

    /**
     * -- Primitive floating point types --
     * Floating points allows to store values containing a fractional portion. Supports positive,
     * negative and zero values.
     *
     * float
     *  - Size: 32 bits
     *  - Smallest positive value: 1.4*10^-45
     *  - Largest positive value: 3.4*10^38
     *  - Literal format: 0.0f
     *
     * double
     *  - Size: 64 bits
     *  - Smallest positive value: 4.9*10^-324
     *  - Largest positive value: 1.7*10^308
     *  - Literal format: 0.0 or 0.0d
     */
    private static void primitiveFloatingPointTypes() {

        float floatType = 0.0f;
        double doubleType = 0.0;
        double explicitDoubleType = 0.0d;

    }

    /**
     * -- Primitive character type --
     * Character type stores a single unicode character, literal values placed between single quotes
     */
    private static void primitiveCharacterType() {

        char regular = 'C';
        char accented = '\u00DA'; //Unicode code points are valid single unicode characters

    }

    /**
     * -- Primitive boolean types --
     * Boolean types stores true or false values, literal values are true and false
     */
    private static void primitiveBooleanType() {

        boolean thisIsJava = true;
        boolean thisIsTrue = false;

    }
}
