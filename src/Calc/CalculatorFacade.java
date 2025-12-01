package Calc;


import Calc.Operation;
import Calc.OperationFactory;
import java.util.List;
import Calc.HistoryOperation;
public class CalculatorFacade {

    private Calculator calculator;

    public CalculatorFacade() {
        calculator = Calculator.getInstance(); //  Singleton
    }

    //  تفتح واجهة الآلة الحاسبة
    public void showCalculator() {
        calculator.setVisible(true);
    }

    //  تنفّذ عملية رياضية وتُرجع الناتج
    public float performOperation(String operation, float a, float b) {
        Operation op = OperationFactory.getOperation(operation);
        if (op == null) {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        return op.apply(a, b); 
    }

    //  تمسح كل شي من الشاشة (Clear)
    public void clearCalculator() {
        calculator.clear();
    }

    //  تعرض الـ History (من Decorator)
    public java.util.List<String> getHistory() {
        return HistoryOperation.getHistory();
    }
}
