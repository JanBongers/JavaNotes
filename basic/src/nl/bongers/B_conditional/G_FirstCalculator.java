package nl.bongers.B_conditional;

public class G_FirstCalculator {

    /**
     * Simple program to demonstrate all previous codes combined.
     */
    public static void main(String[] args) {
        double val1 = 100.0;
        double val2 = 0.0;
        double result;
        char opCode = 'a';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            result = val2 != 0.0 ? val1 / val2 : 0.0;
        else if (opCode == 'm')
            result = val1 * val2;
        else {
            result = 0.0;
            System.out.println("Invalid opCode");
        }

        System.out.println("Result: " + result);
    }
}
