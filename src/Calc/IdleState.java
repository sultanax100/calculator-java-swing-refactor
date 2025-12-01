package Calc;

public class IdleState implements CalculatorState {

    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.setDisplay(digit);
        calc.setState(new TypingState());
    }

    @Override
    public void onOperation(Calculator calc, String op) {
        // لا يمكن اختيار عملية قبل كتابه اول رقم
    }

    @Override
    public void onEquals(Calculator calc) {
        // ولا شي
    }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
        calc.setState(new IdleState());
    }
}
