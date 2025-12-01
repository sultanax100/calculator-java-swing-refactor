package Calc;

/**
 * واجهة تمثل حالة الآلة الحاسبة.
 * كل حالة تحدد كيف تتصرف الآلة عند ضغط رقم / عملية / يساوي / مسح.
 */
public interface CalculatorState {

    void onNumber(Calculator calc, String digit);

    void onOperation(Calculator calc, String op);

    void onEquals(Calculator calc);

    void onClear(Calculator calc);
}
