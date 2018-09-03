package nl.bongers.A_introduction.B_syntax;

public class A_Variable {

    /**
     * Variable gives the ability to store and manipulate values. A variable is simply a named data storage.
     * Since Java is a strongly types language, one must always declare the data type of a variable.
     *
     * Convention of naming variables:
     *
     *  - Only letters and numbers are used
     *  - Use of Camel Case with multi-word variables:
     *      * First letter lower case
     *      * Each following word starts with an upper case as the first letter
     *      * e.g.: accountBalance
     */
    public static void main(String[] args) {

        //Declaration of a variable named 'value' of type integer (primitive)
        int value;

        //'value' can only store data that is compatible with the type int
        //Assigning the value '100' to the declared variable 'value'
        value = 100;

        //You can also declare and assign a variable in a single statement
        int otherValue = 50;
        System.out.println("Value of 'otherValue': " + otherValue);

        //Variable can be modified. One can modify the value that is stored in the variable
        System.out.println("Value of 'value' before modifying: " + value);
        value = 10;
        System.out.println("Value of 'value' after modifying: " + value);
    }
}
