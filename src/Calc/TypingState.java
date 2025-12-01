package Calc;

public class TypingState implements CalculatorState {

    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.appendDigit(digit);
    }

    @Override
    public void onOperation(Calculator calc, String op) {
        calc.saveFirstOperand();
        calc.setOperation(op);
        calc.setState(new OperationSelectedState());
    }

    @Override
    public void onEquals(Calculator calc) {
        calc.compute();
        calc.updateDisplay();
        calc.setState(new ResultState());
    }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
        calc.setState(new IdleState());
    }
}
