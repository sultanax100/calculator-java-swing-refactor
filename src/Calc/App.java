package Calc;

/**
 *
 * @author youcefhmd
 */

public class App {

    public static void main(String[] args) {  
        //deleting this line to test the singleton --> new Calculator().setVisible(true);
        //testing the sigelton 
        Calculator.getInstance().setVisible(true);
    }

}
