package Calc;

public class ResultState implements CalculatorState {

    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.setDisplay(digit);
        calc.setState(new TypingState());
    }

    @Override
    public void onOperation(Calculator calc, String op) {
        calc.saveFirstOperand();
        calc.setOperation(op);
        calc.setState(new OperationSelectedState());
    }

    @Override
    public void onEquals(Calculator calc) {
        // تجاهل
    }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
        calc.setState(new IdleState());
    }
}
