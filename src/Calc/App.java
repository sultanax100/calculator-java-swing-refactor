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

            calculator1.setVisible(true);

        });
    }

}
