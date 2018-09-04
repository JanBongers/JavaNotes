package nl.bongers.C_loops;

public class B_Array {

    /**
     * An Array provides an ordered collection of elements. In other words, they allow us to store multiple values
     * of a common type under a single name.
     *
     * Declare as an array with [] (square brackets) right after the type (e.g. int or String --> int[] or String[])
     *
     *  int[] vals = new int[3].
     *
     * The number in the square bracket after 'new' declares to allocate space to store three int values. Each element is
     * accessed via an index. The index is zero-based, thus run from 0 to one less than the number of elements. So in the
     * case of the 'vals' example above, the first one is 0, then 1, then 2. The indexes can be used to put values in and
     * get values from the array. The number of elements in an array can be found via array's 'length' value.
     *
     */
    public static void main(String[] args) {
        System.out.println("Arrays");

        int[] vals = new int[3]; //Declaring an int array with 3 spaces
        vals[0] = 10; //Stores value '10' in the first position, index 0
        vals[1] = 20; //Stores value '20' in the second position, index 1
        vals[2] = 15; //Stores value '15' in the third position, index 2

        /*
        Arrays make it easy to move through the array values using loops. Lets add all the values from 'vals' up and
        store the result in 'sum'. To do this, we need to know how many elements to walk through. The 'length' value
        of array's van be used for this.
         */

        int sum = 0;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }
        System.out.println("Sum result: " + sum);

        /*
        The declaration of an array with stored values has a shorthand to make it easier. Instead of what we did above, we can
        also use curly brackets, the method as demonstrated below.
         */

        int[] otherVals = {10, 20, 15}; //this has the same effect as declaring it as shown above
        int otherSum = 0;
        for (int i = 0; i < otherVals.length; i++) {
            otherSum += otherVals[i];
        }
        System.out.println("Sum result: " + otherSum);

    }
}
