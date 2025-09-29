package Calc;

/**
 *
 * @author youcefhmd
 */

public class App {

    public static void main(String[] args) {  
        //deleting this line to test the singleton --> new Calculator().setVisible(true);
        //testing the sigelton 
        javax.swing.SwingUtilities.invokeLater(() -> {
            Calculator calculator1 = Calculator.getInstance();
            Calculator calculator2 = Calculator.getInstance();
            System.out.println("same instance? " + (calculator1 == calculator2));
            calculator1.setVisible(true);
        });
    }

}
