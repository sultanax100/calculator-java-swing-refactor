package Calc;

/**
 *
 * @author youcefhmd
 */

public class App {

    public static void main(String[] args) {  
        javax.swing.SwingUtilities.invokeLater(() -> {

            //  اختبار الـ Singleton 
            Calculator calculator1 = Calculator.getInstance();
            Calculator calculator2 = Calculator.getInstance();
            System.out.println("same instance? " + (calculator1 == calculator2));

            //  بدل ما نستخدم calculator1.setVisible → نستخدم Facade
            CalculatorFacade calc = new CalculatorFacade();
            calc.showUI();  // هذا يعرض الواجهة
        });
    }

}
