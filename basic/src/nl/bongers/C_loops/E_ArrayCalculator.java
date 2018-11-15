package nl.bongers.C_loops;

public class E_ArrayCalculator {

    /**
     * Calculator with Arrays, Loops and Switch
     */
    public static void main(String[] args) {
        double[] leftValues = {100.0, 50,0, 25.0, 10.0};
        double[] rightValues = {50.0, 10.0, 0.0, 20.0};
        char[] opCodes = {'a', 'd', 's', 'm'};
        double[] results = new double[opCodes.length];


        for (int i = 0; i < opCodes.length; i++) {
            switch(opCodes[i]) {
                case 'a':
                    results[i] = leftValues[i] + rightValues[i];
                    break; //See class 'D_SwitchStatement' for why breaks are needed
                case 's':
                    results[i] = leftValues[i] - rightValues[i];
                    break;
                case 'd':
                    results[i] = rightValues[i] != 0.0 ? leftValues[i] / rightValues[i] : 0.0;
                    break;
                case 'm':
                    results[i] = leftValues[i] * rightValues[i];
                    break;
                default :
                    results[i] = 0.0;
                    System.out.println("Invalid opCode");
                    break;
            }
        }

        for(double result : results) {
            System.out.println("Result: " + result);
        }
    }
}
