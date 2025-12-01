package Calc;

public class OperationSelectedState implements CalculatorState {

    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.setDisplay(digit);
        calc.setState(new TypingState());
    }

    @Override
    public void onOperation(Calculator calc, String op) {
        calc.setOperation(op);  
    }

    @Override
    public void onEquals(Calculator calc) {
        // لا يوجد رقم ثاني → تجاهل فقط
    }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
        calc.setState(new IdleState());
    }
}
