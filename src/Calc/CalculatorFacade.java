package Calc;

// Facade Pattern: Interface بسيطة للتحكم بحسابات الآلة فقط (بدون GUI)
public class CalculatorFacade {

    private final Calculator calculator;

    public CalculatorFacade() {
        this.calculator = Calculator.getInstance(); // نستخدم Singleton
    }

    // إدخال رقم أو نقطة
    public void enterNumber(String number) {
        calculator.appendNumber(number);
    }

    // اختيار عملية (+, -, ×, ÷)
    public void chooseOperation(String operation) {
        calculator.chooseOperation(operation);
    }

    // = (تنفيذ العملية وعرض الناتج)
    public void calculate() {
        calculator.compute();
        calculator.updateDisplay();
    }

    // C (مسح كل شيء)
    public void clear() {
        calculator.clear();
    }

    // نقرأ الرقم الظاهر حالياً
    public String getCurrentDisplay() {
        return calculator.getCurrentOperand(); // لازم نضيف getter بسيط إذا غير موجود
    }

    // نقرأ الرقم السابق والعملية (مثلاً "5 +")
    public String getPreviousDisplay() {
        return calculator.getPreviousOperand(); // Getter بسيط أيضاً
    }
     // نعرض النافذة لو بغينا GUI (ما يمس الواجهة)
    public void showUI() {
        calculator.setVisible(true);
    }
}
