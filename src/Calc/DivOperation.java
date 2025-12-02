
package Calc;

/**
 *
 * @author Sulta
 */
public class DivOperation implements Operation{
    @Override
    public float apply(float a, float b) {
        if (b == 0f) {
            throw new ArithmeticException("Error! Division by zero is not accepted");
        }
        return a / b;
    }
}
