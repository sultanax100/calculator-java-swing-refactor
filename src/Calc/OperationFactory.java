
package Calc;

/**
 *
 * @author Sulta
 */
public class OperationFactory {
    public static Operation getOperation(String op) {
        switch (op) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            case "×":
                return new MultOperation();
            case "÷":
                return new DivOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}
