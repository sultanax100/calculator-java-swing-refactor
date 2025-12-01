/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author Sulta
 */
public class DivOperation implements Operation{
    @Override
    public float apply(float a, float b) {
        if (b == 0f) {
            throw new ArithmeticException("Error! Division by zero is not accepted");
        }
        return a / b;
    }
}
