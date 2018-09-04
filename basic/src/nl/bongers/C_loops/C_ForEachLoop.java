package nl.bongers.C_loops;

public class C_ForEachLoop {

    /**
     * For-each loop, also known as an enhanced for loop, is one of the most convenient ways to walk through the
     * members of an array. It takes care of executing the loop / statement within the loop once for each member
     * of the array. For-each loop handles the details of getting the length of the array, as well as accessing
     * each of the values.
     *
     *  for (loop-variable-declaration : array)
     *      statement;
     */
    public static void main(String[] args) {
        System.out.println("For-each loop");

        int[] vals = {10, 20, 15};
        int sum = 0;

        for (int currentVal : vals) {
            sum += currentVal;
        }
        System.out.println("Sum result: " + sum);
    }
}
