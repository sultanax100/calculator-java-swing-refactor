
package Calc;

/**
 *
 * @author Sulta
 */
public class LoggingOperation extends OperationDecorator{
    public LoggingOperation(Operation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public float apply(float a, float b) {
        float result = super.apply(a, b);
        System.out.println("[LOG] " + a + " " + getSymbol(decoratedOperation) + " " + b + " = " + result);
        return result;
    }

    private String getSymbol(Operation op) {
        if (op instanceof AddOperation) return "+";
        if (op instanceof SubOperation) return "-";
        if (op instanceof MultOperation) return "×";
        if (op instanceof DivOperation) return "÷";
        return "?";
    }
}
