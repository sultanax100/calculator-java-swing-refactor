package Calc;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {

            CalculatorFacade calcFacade = new CalculatorFacade();

            // بدل ما نستدعي Calculator مباشرة:
            calcFacade.showCalculator();

            // مثال تشغيل:
            float result = calcFacade.performOperation("+", 5, 3);
            System.out.println("Result = " + result);
        });
    }
}

//