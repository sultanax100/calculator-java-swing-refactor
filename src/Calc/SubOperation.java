
package Calc;

/**
 *
 * @author Sulta
 */
public class SubOperation implements Operation{
     @Override
    public float apply(float a, float b) {
        return a - b;
    }
}
