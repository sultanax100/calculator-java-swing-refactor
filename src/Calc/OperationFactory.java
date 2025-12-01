/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Sulta
 */
public class OperationFactory {
    public static Operation getOperation(String op) {
        switch (op) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            case "×":
                return new MultOperation();
            case "÷":
                return new DivOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}
